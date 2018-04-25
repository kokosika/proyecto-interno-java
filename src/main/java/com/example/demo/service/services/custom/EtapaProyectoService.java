package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IEtapaProyectoRepositorio;
import com.example.demo.service.interfaces.custom.IEtapaProyectoService;
import com.example.demo.service.services.BaseService;

@Service
public class EtapaProyectoService extends BaseService implements IEtapaProyectoService{

	@Autowired
	private IEtapaProyectoRepositorio etapaRepo;
	
	public ResponseEntity<GenericResponse> getAllEtapaProyecto(){
		try {
			return ok(this.etapaRepo.getAllEtapaProyecto());
		} catch (Exception e) {
			return customException(e);
		}
	}
	
}
