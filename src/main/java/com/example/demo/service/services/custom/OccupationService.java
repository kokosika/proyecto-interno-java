package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.repository.interfaces.custom.IOccupationRepository;
import com.example.demo.service.interfaces.custom.IOccupationService;
import com.example.demo.service.services.BaseService;

@Service
public class OccupationService extends BaseService implements IOccupationService {

	@Autowired
	private IOccupationRepository occuRepo;

	public ResponseEntity<GenericResponse> getAllOccupation() {
		try {
			return ok(this.occuRepo.getAllOccupation());
		} catch (Exception e) {
			return customException(e);
		}
	}

	public ResponseEntity<GenericResponse> getComboAllOccupation() {
		try {
			return ok(this.occuRepo.getComboAllOccupation());
		} catch (Exception e) {
			return customException(e);
		}
	}

	public ResponseEntity<GenericResponse> getOccupationByKey(OccupationFilterDto filter) {
		try {
			return ok(this.occuRepo.getOccupationByKey(filter));
		} catch (Exception e) {
			return customException(e);
		}
	}

	public ResponseEntity<GenericResponse> getConsultarCargos(Integer consultar) {
		try {
			return ok(this.occuRepo.getConsultarCargos(consultar));
		} catch (Exception e) {
			return customException(e);
		}
	}
}
