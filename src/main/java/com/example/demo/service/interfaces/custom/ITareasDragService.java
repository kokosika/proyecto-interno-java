package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.TareasDragDto;
import com.example.demo.service.interfaces.IBaseService;

public interface ITareasDragService extends IBaseService {

	public ResponseEntity<GenericResponse> todasLasTareas(Double idProyecto);
	public ResponseEntity<GenericResponse> tareasPendientes(Double idProyecto);
	public ResponseEntity<GenericResponse> tareasEnDesarrollo(Double idProyecto);
	public ResponseEntity<GenericResponse> tareasTerminadas(Double idProyecto);
	public ResponseEntity<GenericResponse> updateEstadoKamban(TareasDragDto dto);
}
