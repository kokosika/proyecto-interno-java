package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.custom.AsignacionTareasCrudDto;
import com.example.demo.dto.custom.AssegnamentDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.custom.IAssegnamentRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class AssegnamentRepository extends BaseRepository implements IAssegnamentRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<AssegnamentDto> getAllAsegnamentProyectByProyect(Integer id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		return (List<AssegnamentDto>) executeList(AssegnamentDto.class, "PRC_GET_ASIGNACIONES", params);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AssegnamentDto> getAllAsegnamentProyect() {
		return (List<AssegnamentDto>) executeList(AssegnamentDto.class, "PRC_GET_PORCENTAJE_ALL_USER");
	}
	
	
	public void guardarAsignacionTareas(AsignacionTareasCrudDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_USUARIO", dto.getIdUsuario());
		params.put("PORCENTAJE", dto.getPorcentajeAsignacion());
		params.put("FECHA_INICIO", dto.getFechaInicio());
		params.put("FECHA_FIN", dto.getFechaFin());
		params.put("ID_PROYECTO", dto.getIdProyecto());
		params.put("NOMBRE_USUARIO", dto.getNombreUsuario());
		execute("PRC_INS_ASIGNACION_TAREAS",params);
	}
	
	public StringDto validarAsignacionParaEditar(AsignacionTareasCrudDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_USUARIO", dto.getIdUsuario());
		params.put("ID_PROYECTO", dto.getIdProyecto());
		return (StringDto) executeList(StringDto.class, "PRC_GET_VALIDAR_ASIGNACION", params).get(0);
	}
	
	public void editarAsignaciones(AsignacionTareasCrudDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_USUARIO", dto.getIdUsuario());
		params.put("PORCENTAJE", dto.getPorcentajeAsignacion());
		params.put("FECHA_INICIO", dto.getFechaInicio());
		params.put("FECHA_FIN", dto.getFechaFin());
		params.put("ID_PROYECTO", dto.getIdProyecto());
		params.put("NOMBRE_USUARIO", dto.getNombreUsuario());
		execute("PRC_UPD_ASIGNACION_TAREAS",params);
	}

}
