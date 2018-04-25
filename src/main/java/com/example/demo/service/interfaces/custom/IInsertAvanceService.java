package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.InsertAvanceDto;
import com.example.demo.service.interfaces.IBaseService;

public interface IInsertAvanceService extends IBaseService{
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public ResponseEntity<GenericResponse> insertAvance(InsertAvanceDto avance);
}
