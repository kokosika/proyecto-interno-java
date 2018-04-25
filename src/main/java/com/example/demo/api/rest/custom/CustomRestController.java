package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.service.interfaces.custom.ICustomService;

@RestController
@RequestMapping(value = "api/proyect")
public class CustomRestController {

	@Autowired
	private ICustomService service;

	@GetMapping
	public ResponseEntity<GenericResponse> getAllProyect() {
		return this.service.getAllProyect();
	}

	@GetMapping(value = "/porcent")
	public ResponseEntity<GenericResponse> getPorcentProyect(Integer data) {
		return this.service.getPorcentProyect(data);
	}

	@GetMapping(value = "/get-combo")
	public ResponseEntity<GenericResponse> getComboAllProyect() {
		return this.service.getComboAllProyect();
	}

	@PostMapping
	public ResponseEntity<GenericResponse> guardarProyecto(@RequestBody ProyectDto data) {
		return this.service.guardarProyecto(data);
	}
	
	@GetMapping(value = "/get-rango-fecha")
	public ResponseEntity<GenericResponse> rangoFechasTodosLosProyectos() {
		return this.service.rangoFechasTodosLosProyectos();
	} 

}
