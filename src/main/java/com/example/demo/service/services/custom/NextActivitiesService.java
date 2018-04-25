package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.INextActivitiesRepository;
import com.example.demo.service.interfaces.custom.INextActivitiesService;
import com.example.demo.service.services.BaseService;

@Service
public class NextActivitiesService extends BaseService implements INextActivitiesService{
	
	@Autowired
	public INextActivitiesRepository nextActivitiesRepository;
	
	public ResponseEntity<GenericResponse> getNextActivitiesPorProyecto(String id){
		try {
			return ok(this.nextActivitiesRepository.getNextActivitiesPorProyecto(id));
		} catch (Exception e) {
			return customException(e);
		}
	}
	

}
