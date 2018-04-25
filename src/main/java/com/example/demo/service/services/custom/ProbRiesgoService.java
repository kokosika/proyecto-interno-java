package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IProbRiesgoRepository;
import com.example.demo.service.interfaces.custom.IProbRiesgoService;
import com.example.demo.service.services.BaseService;
@Service
public class ProbRiesgoService extends BaseService implements IProbRiesgoService{
	
	@Autowired
	private IProbRiesgoRepository probRiesgoRepository;
	
	public ResponseEntity<GenericResponse> getProbRiesgo(){
		try {
			return ok(this.probRiesgoRepository.getProbRiesgos());
		} catch (Exception e) {
			return customException(e);
		}
	}

}
