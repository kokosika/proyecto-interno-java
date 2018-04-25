package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IUsuarioXOcupacionRepository;
import com.example.demo.service.interfaces.custom.IUsuarioXOcupacionService;
import com.example.demo.service.services.BaseService;

@Service
public class UsuarioXOcupacionService extends BaseService implements IUsuarioXOcupacionService{
	
	@Autowired
	private IUsuarioXOcupacionRepository occuRepo;
	
	public ResponseEntity<GenericResponse> getAllUsuarioOcupacion(){
		try {
			return ok(this.occuRepo.getAllUsuarioOcupacion());
		} catch (Exception e) {
			return customException(e);
		}
	}

}
