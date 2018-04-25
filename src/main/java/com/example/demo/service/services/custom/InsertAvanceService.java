package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.InsertAvanceDto;
import com.example.demo.repository.interfaces.custom.IInsertAvanceRepository;
import com.example.demo.service.interfaces.custom.IInsertAvanceService;
import com.example.demo.service.services.BaseService;

@Service
public class InsertAvanceService extends BaseService implements IInsertAvanceService{
	
	@Autowired
	private IInsertAvanceRepository repo;
	
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public ResponseEntity<GenericResponse> insertAvance(InsertAvanceDto avance){
		try {
			this.repo.insertAvance(avance);
			return customResponse("ok", "insertado", HttpStatus.ACCEPTED);
		}catch (Exception e) {
			return customException(e);
		}
	}

}
