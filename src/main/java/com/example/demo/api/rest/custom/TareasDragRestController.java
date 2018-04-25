package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.TareasDragDto;
import com.example.demo.service.interfaces.custom.ITareasDragService;

@RestController
@RequestMapping(value = "api/tareas-drag")
public class TareasDragRestController {

	@Autowired
	private ITareasDragService dragService;
	
	@GetMapping(value = "/todas")
	public ResponseEntity<GenericResponse> todasLasTareas(Double data){
	
		return this.dragService.todasLasTareas(data);
	}
	
	@GetMapping(value = "/pendientes")
	public ResponseEntity<GenericResponse> tareasPendientes(Double data){
		return this.dragService.tareasPendientes(data);
	}
	
	@GetMapping(value = "/desarrollo")
	public ResponseEntity<GenericResponse> tareasEnDesarrollo(Double data){
		return this.dragService.tareasEnDesarrollo(data);
	}
	@GetMapping(value = "/terminadas")
	public ResponseEntity<GenericResponse> tareasTerminadas(Double data){
		return this.dragService.tareasTerminadas(data);
	}
	@PostMapping(value = "/update-estado")
	public ResponseEntity<GenericResponse> updateEstadoKamban(@RequestBody TareasDragDto dto){
		return this.dragService.updateEstadoKamban(dto);
	}
	
}
