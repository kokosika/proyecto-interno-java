package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.TareaInsertDto;
import com.example.demo.dto.custom.TaskDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.custom.ITaskRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class TaskRepository extends BaseRepository implements ITaskRepository {

	@SuppressWarnings("unchecked")
	public List<TaskDto> getAllTask(Integer id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		return (List<TaskDto>) executeList(TaskDto.class, "PRC_TASK", params);
	}
	
	public void guardarTarea(TareaInsertDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_PROYECTO", dto.getIdProyecto());
		params.put("NOMBRE_TAREA", dto.getNombreTarea());
		params.put("FECHA_INCIO_TAREA", dto.getFechaInicioTarea());
		params.put("FECHA_TERMINO_TAREA", dto.getFechaTerminoTarea());
		params.put("PORC_AVANCE_TAREA", dto.getPorcAvanceTarea());
		params.put("DEPENDENCIA", dto.getDependencia());
		params.put("FECHA_INICIO_LB", dto.getFechaInicioLb());
		params.put("FECHA_TERMINO_LB", dto.getFechaTerminoTb());
		params.put("NIVEL", dto.getNivel());
		params.put("MILE", dto.getMile());
		params.put("GROUP_P", dto.getGroupP());
		params.put("PARENT", dto.getParent());
		params.put("OPEN_P", dto.getOpen());
		params.put("PORCENTAJE_ESPERADO",dto.getPorcentajeEsperado());
		params.put("ESTADO_KAMBAS",dto.getEstadoKamban());
		execute("PRC_INS_TAREAS", params);
	}
	
	public StringDto validarTareaParaUpdateOInsert(TareaInsertDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_PROYECTO", dto.getIdProyecto());
		return (StringDto)executeList(StringDto.class, "PRC_GET_VALIDAR_TAREA", params).get(0);
	}
	
	public void editarTarea(TareaInsertDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_PROYECTO", dto.getIdProyecto());
		params.put("NOMBRE_TAREA", dto.getNombreTarea());
		params.put("FECHA_INCIO_TAREA", dto.getFechaInicioTarea());
		params.put("FECHA_TERMINO_TAREA", dto.getFechaTerminoTarea());
		params.put("PORC_AVANCE_TAREA", dto.getPorcAvanceTarea());
		params.put("DEPENDENCIA", dto.getDependencia());
		params.put("FECHA_INICIO_LB", dto.getFechaInicioLb());
		params.put("FECHA_TERMINO_LB", dto.getFechaTerminoTb());
		params.put("NIVEL", dto.getNivel());
		params.put("MILE", dto.getMile());
		params.put("GROUP_P", dto.getGroupP());
		params.put("PARENT", dto.getParent());
		params.put("OPEN_P", dto.getOpen());
		params.put("PORCENTAJE_ESPERADO",dto.getPorcentajeEsperado());
		params.put("ESTADO_KAMBAS",dto.getEstadoKamban());
		execute("PRC_UPD_TAREAS" , params);
	}
	
	@SuppressWarnings("unchecked")
	public List<TareaInsertDto> getAllTareas(){
		return (List<TareaInsertDto> ) executeList(TareaInsertDto.class, "PRC_GET_TODAS_TAREAS");
	}
	
	public void borrarTareasPorProyecto(Integer idProyecto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		execute("PRC_DEL_TAREAS",params);
	}
	
	public void updatePorcentajeKambanTarea(Double porcentaje, String idTarea, Integer idProyecto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("PORCENTAJE_KAMBAN", porcentaje);
		params.put("ID_TAREA", idTarea);
		params.put("ID_PROYECTO", idProyecto);		
		execute("PRC_UPD_PORCENTAJE_KAMBAN_TAREA",params);
	}

}
