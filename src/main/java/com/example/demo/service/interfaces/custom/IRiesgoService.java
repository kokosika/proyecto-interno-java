package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.IBaseService;

public interface IRiesgoService  extends IBaseService{
	
	public ResponseEntity<GenericResponse> getAllRiesgo(String id);
	/**
	 * 
	 * @param id
	 * @return
	 */
	
	public ResponseEntity<GenericResponse> deleteRiesgo(Integer id);

}
