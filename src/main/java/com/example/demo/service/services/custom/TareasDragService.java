package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.TareasDragDto;
import com.example.demo.repository.interfaces.custom.ITareasDragRepositorio;
import com.example.demo.service.interfaces.custom.ITareasDragService;
import com.example.demo.service.services.BaseService;

@Service
public class TareasDragService extends BaseService implements ITareasDragService {

	@Autowired
	private ITareasDragRepositorio dragRepositorio;
	
	public ResponseEntity<GenericResponse> todasLasTareas(Double idProyecto){
		try {
			return ok(this.dragRepositorio.todasLasTareas(idProyecto));
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> tareasPendientes(Double idProyecto){
		try {
			return ok(this.dragRepositorio.tareasPendientes(idProyecto));
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> tareasEnDesarrollo(Double idProyecto){
		try {
			return ok(this.dragRepositorio.tareasEnDesarrollo(idProyecto));
		} catch (Exception e) {
			return customException(e);
		}
	}
	public ResponseEntity<GenericResponse> tareasTerminadas(Double idProyecto){
		try {
			return ok(this.dragRepositorio.tareasTerminadas(idProyecto));
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> updateEstadoKamban(TareasDragDto dto){
		try {
			this.dragRepositorio.updateEstadoKamban(dto);
			return ok();
		} catch (Exception e) {
			return customException(e);
		}
	}
	
}
