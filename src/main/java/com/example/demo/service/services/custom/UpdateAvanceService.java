package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UpdateAvanceDto;
import com.example.demo.repository.interfaces.custom.IUdpateAvanceRepository;
import com.example.demo.service.interfaces.custom.IUpdateAvanceService;
import com.example.demo.service.services.BaseService;

@Service
public class UpdateAvanceService extends BaseService implements IUpdateAvanceService{
	
	@Autowired
	private IUdpateAvanceRepository repo;
	
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public ResponseEntity<GenericResponse> updateAvance(UpdateAvanceDto avance){
		try {
			this.repo.updateAvance(avance);;
			return customResponse("ok", "actualizado", HttpStatus.ACCEPTED);
		}catch (Exception e) {
			return customException(e);
		}
	}
}
