package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.service.interfaces.IBaseService;

public interface IOccupationService extends IBaseService {

	public ResponseEntity<GenericResponse> getAllOccupation();

	public ResponseEntity<GenericResponse> getComboAllOccupation();

	public ResponseEntity<GenericResponse> getOccupationByKey(OccupationFilterDto filter);

	public ResponseEntity<GenericResponse> getConsultarCargos(Integer consultar);

}
