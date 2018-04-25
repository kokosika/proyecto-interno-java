package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.service.interfaces.IBaseService;

public interface IAssignmentService extends IBaseService {

	public ResponseEntity<GenericResponse> getAllOcupationByProyect(Integer id);

	public ResponseEntity<GenericResponse> getPorcenAsigForUser(Integer id);

	public ResponseEntity<GenericResponse> getAllOcupation(OccupationFilterDto data);

	public ResponseEntity<GenericResponse> getPorcenAsigForUserAll();

}
