package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.InsertRiesgoDto;
import com.example.demo.repository.interfaces.custom.IInsertRiesgoRepository;
import com.example.demo.service.interfaces.custom.IInsertRiesgoService;
import com.example.demo.service.services.BaseService;

@Service
public class InsertRiesgoService extends BaseService implements IInsertRiesgoService{
	
	@Autowired
	private IInsertRiesgoRepository repo;
	
	/**
	 * 
	 * @param riesgo
	 * @return
	 */
	public ResponseEntity<GenericResponse> insertRiesgo(InsertRiesgoDto riesgo){
		try {
			this.repo.insertRiesgo(riesgo);
			return customResponse("ok", "insertado", HttpStatus.ACCEPTED);
		}catch (Exception e) {
			return customException(e);
		}
	}
}
