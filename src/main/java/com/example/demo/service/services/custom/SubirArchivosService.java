package com.example.demo.service.services.custom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.AsignacionTareasCrudDto;
import com.example.demo.dto.custom.PathDocDto;
import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.dto.custom.TareaInsertDto;
import com.example.demo.repository.interfaces.custom.IAssegnamentRepository;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.repository.interfaces.custom.IPathDocRepository;
import com.example.demo.repository.interfaces.custom.ITaskRepository;
import com.example.demo.repository.interfaces.custom.IUserRepository;
import com.example.demo.service.interfaces.custom.ISubirArchivosService;
import com.example.demo.service.services.BaseService;

import net.sf.mpxj.CustomField;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.ResourceAssignment;
import net.sf.mpxj.Task;
import net.sf.mpxj.mpp.MPPReader;
import net.sf.mpxj.mspdi.MSPDIWriter;
import net.sf.mpxj.reader.ProjectReader;

@Service
public class SubirArchivosService extends BaseService implements ISubirArchivosService {

	@Autowired
	private ICustomRepository custRepo;
	@Autowired
	private IPathDocRepository docRepository;
	@Autowired
	private ITaskRepository taskRepository;
	@Autowired
	private IAssegnamentRepository asignacionRepo;
	@Autowired
	private IUserRepository userRepository;

	public ResponseEntity<GenericResponse> guardarArchivos(InputStream archivo, Integer id, MultipartFile multi) {
		FileOutputStream os = null;
		try {
			ProjectReader reader = new MPPReader();
			ProjectFile project = reader.read(archivo);
			MSPDIWriter writer = new MSPDIWriter();		
			// obtener nombre proyecto
			String nombreProyecto = custRepo.getNombreProyecto(id).getData();
			File files = new File(PATH_JAVA + nombreProyecto);
			if (!files.exists()) {
				files.mkdirs();
				// Guarda en la base de datos los mime y rutas del xml
				PathDocDto pathXML = new PathDocDto();
				pathXML.setMime("xml");
				pathXML.setProyectoIdFk(id);
				pathXML.setPath(PATH_JAVA + nombreProyecto + "\\" + nombreProyecto + ".xml");
				pathXML.setNombre(nombreProyecto);

				this.docRepository.guardarPath(pathXML);

				// Guarda en la base de datos los mime y rutas del mpp
				PathDocDto pathMPP = new PathDocDto();
				pathMPP.setMime("mpp");
				pathMPP.setProyectoIdFk(id);
				pathMPP.setPath(PATH_JAVA + nombreProyecto + "\\" + nombreProyecto + ".mpp");
				pathMPP.setNombre(nombreProyecto);
				this.docRepository.guardarPath(pathMPP);
			}

			writer.write(project, files.getPath() + "\\" + nombreProyecto + ".xml");
			os = new FileOutputStream(files.getPath() + "\\" + nombreProyecto + ".mpp");
			os.write(multi.getBytes());
			listHierarchy(project, id);
			guardarRecursos(project, id);
			return ok();
		} catch (Exception e) {
			return customException(e);
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					return customException(e);
				}
			}
		}
	}

	public void listHierarchy(ProjectFile file, Integer id) {
		this.taskRepository.borrarTareasPorProyecto(id);
		for (Task task : file.getChildTasks()) {
			listHierarchy(task, " ", id);
		}
	}

	private void listHierarchy(Task task, String indent, Integer id) {		
		try {
			for (Task child : task.getChildTasks()) {			
				try {
					if (child.getUniqueID() == 1) {
						ProyectDto dto = new ProyectDto();
						dto.setIdProyecto(id);
						dto.setFechaInicio((task.getBaselineEstimatedStart() == null) ? task.getStart()
								: task.getBaselineEstimatedStart());
						dto.setFechaFin((task.getBaselineEstimatedFinish() == null) ? task.getFinish()
								: task.getBaselineEstimatedFinish());
						dto.setPorcentajeAvance(task.getPercentageComplete().doubleValue());					
						dto.setPorcentajeEsperado(task.getFieldByAlias("% Completado Esperado").toString());
						this.custRepo.editarProyecto(dto);
					} else {
						TareaInsertDto dto = new TareaInsertDto();
						dto.setIdTarea(child.getWBS());
						dto.setIdProyecto(id);
						dto.setNombreTarea(child.getName());
						dto.setFechaInicioLb(child.getBaselineEstimatedStart());
						dto.setFechaTerminoTb(child.getBaselineEstimatedFinish());
						dto.setFechaInicioTarea(child.getStart());
						dto.setFechaTerminoTarea(child.getFinish());
						dto.setNivel(child.getOutlineLevel());
						dto.setDependencia(child.getParentTask().getWBS());
						dto.setOpen((child.getActive()) ? 1 : 0);
						dto.setPorcAvanceTarea(child.getPercentageComplete().doubleValue());
						dto.setPorcentajeEsperado(child.getFieldByAlias("% Completado Esperado").toString());
						
						//evaluar estado kambas
						if(dto.getPorcAvanceTarea() == 0) {					
							dto.setEstadoKamban(1);
						}else if(dto.getPorcAvanceTarea() != 0 && dto.getPorcAvanceTarea() != 100) {					
							dto.setEstadoKamban(2);
						}else {					
							dto.setEstadoKamban(3);
						}
						
						if (!this.taskRepository.validarTareaParaUpdateOInsert(dto).getData().equals("0")) {
							this.taskRepository.editarTarea(dto);
						} else {
							this.taskRepository.guardarTarea(dto);
						}
					}
					listHierarchy(child, indent + " ", id);
				} catch (Exception e) {
					
				}
			}			
		} catch (Exception e) {
			
		}
	}

	private void guardarRecursos(ProjectFile project, Integer id) {
		for (ResourceAssignment assignment : project.getAllResourceAssignments()) {
			Task task = assignment.getTask();
			
			Resource resource = assignment.getResource();
			String resourceName;
			if (resource == null) {
				resourceName = "otro";
			} else {
				resourceName = resource.getName();
			}			
			AsignacionTareasCrudDto dto = new AsignacionTareasCrudDto();
			dto.setIdTarea(task.getWBS());
			dto.setIdProyecto(id);
			dto.setFechaFin(
					(task.getBaselineEstimatedFinish() == null) ? new Timestamp(task.getFinish().getTime()) : new Timestamp(task.getBaselineEstimatedFinish().getTime()));
			dto.setFechaInicio(					
					(task.getBaselineEstimatedStart() == null) ? new Timestamp(task.getStart().getTime()) : new Timestamp(task.getBaselineEstimatedStart().getTime()));			
			dto.setIdUsuario(
					Integer.parseInt(this.userRepository.getIdPorNombreUsuario(resourceName.trim().toLowerCase())));			
			dto.setNombreUsuario(resourceName);
			try {
				dto.setPorcentajeAsignacion((resource.getMaxUnits()==null) ? 0 : resource.getMaxUnits().doubleValue());	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}		
			if (!this.asignacionRepo.validarAsignacionParaEditar(dto).getData().equals("0")) {				
					this.asignacionRepo.editarAsignaciones(dto);				
			} else {				
					this.asignacionRepo.guardarAsignacionTareas(dto);
			}
		}
	}
}
