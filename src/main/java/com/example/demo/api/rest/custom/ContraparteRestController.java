package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IContraparteService;

@RestController
@RequestMapping(value = "api/contraparte")
public class ContraparteRestController{

	@Autowired
	private IContraparteService contaparteService;
	
	@GetMapping(value = "/combo-contraparte")
	public ResponseEntity<GenericResponse> getComboContraparte(Integer data){
		return this.contaparteService.getComboContraparte(data);
	}
	
}
