package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IEtapaProyectoService;

@RestController
@RequestMapping(value = "api/etapa-proyecto")
public class EtapaProyectoRestController {
	
	 @Autowired
	 private IEtapaProyectoService etapaSerivce;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getAllEtapaProyecto(){
		return this.etapaSerivce.getAllEtapaProyecto();
	}
}
