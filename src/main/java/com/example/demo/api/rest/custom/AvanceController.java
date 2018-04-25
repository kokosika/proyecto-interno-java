package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IAvanceService;

@RestController
@RequestMapping(value = "api/avances")

public class AvanceController {
	
	@Autowired
	private IAvanceService assigServiceAvance;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getAllAvance(String data) {
		return this.assigServiceAvance.getAllAvance(data);
	}
	
	@GetMapping(value = "/getdiasatraso")
	public ResponseEntity<GenericResponse> obtenerInfoProyecto(String data) {
		return this.assigServiceAvance.getDiasAtraso(data);
	}
	
	@GetMapping(value = "/deleteavance")
	public ResponseEntity<GenericResponse> deleteAvance(Integer data) {
		return this.assigServiceAvance.deleteAvance(data);
	}
	@GetMapping(value = "atrasos-aldia")
	public ResponseEntity<GenericResponse> getAvancesProyectosPorEstadoPorcentaje() {
		return this.assigServiceAvance.getAvancesProyectosPorEstadoPorcentaje();
	}
	
	@GetMapping(value = "atrasos-detalle")
	public ResponseEntity<GenericResponse> getAvancesProyectosAtrasadosDetalle() {
		return this.assigServiceAvance.getAvancesProyectosAtrasadosDetalle();
	}

}
