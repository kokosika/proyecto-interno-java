package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.InsertRiesgoDto;
import com.example.demo.service.interfaces.custom.IInsertRiesgoService;

@RestController
@RequestMapping(value = "api/insertriesgos")
public class InsertRestController {
	@Autowired
	private IInsertRiesgoService assigServiceInsertRiesgo;
	
	@PostMapping
	public ResponseEntity<GenericResponse> insertRiesgo(@RequestBody InsertRiesgoDto riesgo){
		return this.assigServiceInsertRiesgo.insertRiesgo(riesgo);
	}

}
