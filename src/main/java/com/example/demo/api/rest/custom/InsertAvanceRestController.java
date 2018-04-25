package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.InsertAvanceDto;
import com.example.demo.service.interfaces.custom.IInsertAvanceService;

@RestController
@RequestMapping(value = "api/insertavances")
public class InsertAvanceRestController {
	@Autowired
	private IInsertAvanceService assigServiceInsertAvance;
	
	@PostMapping
	public ResponseEntity<GenericResponse> insertAvance(@RequestBody InsertAvanceDto avance){
		return this.assigServiceInsertAvance.insertAvance(avance);
	}
	
}
