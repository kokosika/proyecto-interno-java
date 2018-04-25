package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.INextActivitiesService;

@RestController
@RequestMapping(value = "api/nextactivities")

public class NextActivitiesRestController {
	
	@Autowired
	public INextActivitiesService assigServiceNextActivities;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getNextActivitiesPorProyecto(String data) {
		return this.assigServiceNextActivities.getNextActivitiesPorProyecto(data);
	}

}
