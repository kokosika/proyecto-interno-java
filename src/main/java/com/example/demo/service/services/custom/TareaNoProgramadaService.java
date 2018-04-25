package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.OtraTareaDto;
import com.example.demo.repository.interfaces.custom.ITareaNoProgramadaRepositorio;
import com.example.demo.service.interfaces.custom.ITareaNoProgramadaService;
import com.example.demo.service.services.BaseService;

@Service
public class TareaNoProgramadaService extends BaseService implements ITareaNoProgramadaService {
	
	@Autowired
	private ITareaNoProgramadaRepositorio tareaNoRepo;

	public ResponseEntity<GenericResponse> getTodasLasNoTareas(){
		try {
			return ok(this.tareaNoRepo.getTodasLasNoTareas());
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> guardarTareaNoProgramada(OtraTareaDto dto){
		try {
			this.tareaNoRepo.guardarTareaNoProgramada(dto);
			return ok();
		} catch (Exception e) {
			return customException(e);
		}
	}
}
