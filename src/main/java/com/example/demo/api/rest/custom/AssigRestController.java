package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IAssignmentService;

@RestController
@RequestMapping(value = "api/assignament")
public class AssigRestController {

	@Autowired
	private IAssignmentService service;

	@GetMapping
	public ResponseEntity<GenericResponse> getAssePorcForUser(Integer data) {
		return this.service.getPorcenAsigForUser(data);
	}

	@GetMapping(value = "/get-all")
	public ResponseEntity<GenericResponse> getAssePorcForUser() {
		return this.service.getPorcenAsigForUserAll();
	}

}
