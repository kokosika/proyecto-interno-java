package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UpdateRiesgoDto;
import com.example.demo.service.interfaces.custom.IUpdateRiesgoService;

@RestController
@RequestMapping(value = "api/updateriesgos")
public class UpdateRiesgoRestController {
	@Autowired
	private IUpdateRiesgoService assigServiceUpdateRiesgo;

	@PostMapping
	public ResponseEntity<GenericResponse> updateRiesgo(@RequestBody UpdateRiesgoDto riesgo){
		return this.assigServiceUpdateRiesgo.updateRiesgo(riesgo);
	}
}
