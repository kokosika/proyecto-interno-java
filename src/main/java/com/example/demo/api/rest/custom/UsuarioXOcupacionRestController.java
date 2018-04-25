package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IUsuarioXOcupacionService;

@RestController
@RequestMapping(value = "api/usuariosocupacion")
public class UsuarioXOcupacionRestController {
	@Autowired
	private IUsuarioXOcupacionService service;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getAllUsuarioOcupacion(){
		return this.service.getAllUsuarioOcupacion();
	}

}
