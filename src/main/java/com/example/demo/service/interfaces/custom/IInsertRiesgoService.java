package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.InsertRiesgoDto;
import com.example.demo.service.interfaces.IBaseService;

public interface IInsertRiesgoService extends IBaseService{
	/**
	 * 
	 * @param riesgo
	 * @return
	 */
	public ResponseEntity<GenericResponse> insertRiesgo(InsertRiesgoDto riesgo);
}
