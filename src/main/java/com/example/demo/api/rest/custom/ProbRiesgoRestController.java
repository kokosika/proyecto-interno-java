package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IProbRiesgoService;

@RestController
@RequestMapping(value = "api/probriesgos")
public class ProbRiesgoRestController {
	
	@Autowired
	private IProbRiesgoService probRiesgoRepository;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getAllProbRiesgo() {
		return this.probRiesgoRepository.getProbRiesgo();
	}

}
