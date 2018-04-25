package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IVigenciaRiesgoRepository;
import com.example.demo.service.interfaces.custom.IVigRiesgoService;
import com.example.demo.service.services.BaseService;

@Service
public class VigRiesgoService extends BaseService implements IVigRiesgoService{
	
	@Autowired
	private IVigenciaRiesgoRepository vigRiesgoRepository;
	
	public ResponseEntity<GenericResponse> getVigRiesgo(){
		try {
			return ok(this.vigRiesgoRepository.getVigenciasRiesgos());
		} catch (Exception e) {
			return customException(e);
		}
	}

}
