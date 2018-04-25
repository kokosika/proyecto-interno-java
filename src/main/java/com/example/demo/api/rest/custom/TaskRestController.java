package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.TareaInsertDto;
import com.example.demo.service.interfaces.custom.ITaskService;

@RestController
@RequestMapping(value = "api/tasks")
public class TaskRestController {

	@Autowired
	private ITaskService service;

	@GetMapping
	public ResponseEntity<GenericResponse> getAllTask(Integer data) {
		return this.service.getAllTask(data);
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<GenericResponse> getAllTareas() {
		return this.service.getAllTareas();
	}
	
	@PostMapping(value="/update-porcentaje-tarea")
	public ResponseEntity<GenericResponse> updatePorcentajeKambanTarea(@RequestBody TareaInsertDto tarea) {		
		return this.service.updatePorcentajeKambanTarea(tarea.getPorcAvanceTarea(), tarea.getIdTarea(), tarea.getIdProyecto());
	}

}
