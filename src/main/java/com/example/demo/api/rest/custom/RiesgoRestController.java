package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IRiesgoService;

@RestController
@RequestMapping(value = "api/riesgos")

public class RiesgoRestController {
	
	@Autowired
	private IRiesgoService assigServiceRiesgo;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getAllRiesgo(String data) {
		return this.assigServiceRiesgo.getAllRiesgo(data);
	}
	
	@GetMapping(value = "/deleteriesgo")
	public ResponseEntity<GenericResponse> deleteRiesgo(Integer data) {
		return this.assigServiceRiesgo.deleteRiesgo(data);
	}
}
