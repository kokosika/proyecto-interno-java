package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.TareasDragDto;
import com.example.demo.repository.interfaces.custom.ITareasDragRepositorio;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class TareasDragRepositorio extends BaseRepository implements ITareasDragRepositorio{

	
	@SuppressWarnings("unchecked")
	public List<TareasDragDto> todasLasTareas(Double idProyecto){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		return (List<TareasDragDto>) executeList(TareasDragDto.class, "PRC_GET_TODAS_LAS_TAREAS", params);
	}
	@SuppressWarnings("unchecked")
	public List<TareasDragDto> tareasPendientes(Double idProyecto){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		return (List<TareasDragDto>) executeList(TareasDragDto.class, "PRC_GET_TAREAS_PENDIENTES", params);
	}
	@SuppressWarnings("unchecked")
	public List<TareasDragDto> tareasEnDesarrollo(Double idProyecto){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		return (List<TareasDragDto>) executeList(TareasDragDto.class, "PRC_GET_TAREAS_EN_DESARROLLO", params);
	}
	@SuppressWarnings("unchecked")
	public List<TareasDragDto> tareasTerminadas(Double idProyecto){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", idProyecto);
		return (List<TareasDragDto>) executeList(TareasDragDto.class, "PRC_GET_TAREAS_TERMINADAS", params);
	}
	
	public void updateEstadoKamban(TareasDragDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_TAREA", dto.getIdTarea());
		params.put("ID_PROYECTO",dto.getIdProyecto());
		params.put("ESTADO_KAMBAN", dto.getEstadoKamban());
		execute("PRC_UPD_TAREAS_DRAG",params);
	}
	
}
