package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.OtraTareaDto;
import com.example.demo.service.interfaces.IBaseService;

public interface ITareaNoProgramadaService extends IBaseService {

	public ResponseEntity<GenericResponse> getTodasLasNoTareas();
	public ResponseEntity<GenericResponse> guardarTareaNoProgramada(OtraTareaDto dto);
}
