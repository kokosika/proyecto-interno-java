package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UserDto;
import com.example.demo.service.interfaces.custom.IUserService;

@RestController
@RequestMapping(value = "api/user")
public class UserRestController {

	@Autowired
	private IUserService service;

	@PostMapping(value = "/login")
	public ResponseEntity<GenericResponse> validateLogin(@RequestBody UserDto user) {
		return service.validateLogin(user);
	}

	@GetMapping
	public ResponseEntity<GenericResponse> comboAllUsuarios(){
		return service.comboAllUsuarios();
	}
	
	@GetMapping(value = "/get-usuarioscontraparte")
	public ResponseEntity<GenericResponse> getUsuariosContraparte(){
		return service.getUsuariosContraparte();
	}
}
