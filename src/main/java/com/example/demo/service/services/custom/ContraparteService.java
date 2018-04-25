package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IContraparteRepository;
import com.example.demo.service.interfaces.custom.IContraparteService;
import com.example.demo.service.services.BaseService;
@Service
public class ContraparteService extends BaseService implements IContraparteService {

	@Autowired
	private IContraparteRepository contraparteRepository;
	
	public ResponseEntity<GenericResponse> getComboContraparte(Integer idCliente){
		try {
			return ok(this.contraparteRepository.getComboContraparte(idCliente));
		} catch (Exception e) {
			return customException(e);
		}
	}
}
