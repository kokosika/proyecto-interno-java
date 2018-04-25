package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UpdateRiesgoDto;
import com.example.demo.repository.interfaces.custom.IUpdateRiesgoRepository;
import com.example.demo.service.interfaces.custom.IUpdateRiesgoService;
import com.example.demo.service.services.BaseService;

@Service
public class UpdateRiesgoService extends BaseService implements IUpdateRiesgoService{
	
	@Autowired
	private IUpdateRiesgoRepository repo;
	
	/**
	 * 
	 * @param riesgo
	 * @return
	 */
	public ResponseEntity<GenericResponse> updateRiesgo(UpdateRiesgoDto riesgo){
		try {
			this.repo.updateRiesgo(riesgo);;
			return customResponse("ok", "actualizado", HttpStatus.ACCEPTED);
		}catch (Exception e) {
			return customException(e);
		}
	}
}
