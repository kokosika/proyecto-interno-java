package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.IBaseService;

public interface IAvanceService extends IBaseService{
	public ResponseEntity<GenericResponse> getAllAvance(String id);
	public ResponseEntity<GenericResponse> getAvancesProyectosPorEstadoPorcentaje();
	public ResponseEntity<GenericResponse> getAvancesProyectosAtrasadosDetalle();

	public ResponseEntity<GenericResponse> getDiasAtraso(String id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	
	public ResponseEntity<GenericResponse> deleteAvance(Integer id);

}
