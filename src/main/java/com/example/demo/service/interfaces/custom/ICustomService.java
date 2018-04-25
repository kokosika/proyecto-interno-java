package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.service.interfaces.IBaseService;

public interface ICustomService extends IBaseService {

	public ResponseEntity<GenericResponse> getAllProyect();

	public ResponseEntity<GenericResponse> getPorcentProyect(Integer id);

	public ResponseEntity<GenericResponse> getComboAllProyect();

	public ResponseEntity<GenericResponse> guardarProyecto(ProyectDto dto);
	public ResponseEntity<GenericResponse> rangoFechasTodosLosProyectos();

}
