package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.service.interfaces.custom.ICustomService;
import com.example.demo.service.services.BaseService;

@Service
public class CustomService extends BaseService implements ICustomService {

	@Autowired
	private ICustomRepository repository;

	@Override
	public ResponseEntity<GenericResponse> getAllProyect() {
		try {
			return ok(this.repository.getAllProyect());
		} catch (Exception e) {
			return customException(e);
		}
	}

	@Override
	public ResponseEntity<GenericResponse> getPorcentProyect(Integer id) {
		try {
			return ok(this.repository.getPorcentProyect(id));
		} catch (Exception e) {
			return customException(e);
		}
	}

	@Override
	public ResponseEntity<GenericResponse> getComboAllProyect() {
		try {
			return ok(this.repository.getComboAllProyect());
		} catch (Exception e) {
			return customException(e);
		}
	}

	@Override
	public ResponseEntity<GenericResponse> guardarProyecto(ProyectDto dto) {
		try {
			dto.setPorcentajeAvance((dto.getPorcentajeAvance() == null) ? 0 : dto.getPorcentajeAvance());
			this.repository.guardarProyecto(dto);
			return ok();
		} catch (Exception e) {
			return customException(e);
		}

	}
	
	public ResponseEntity<GenericResponse> rangoFechasTodosLosProyectos() {
		try {			
			return ok(this.repository.rangoFechasTodosLosProyectos());
		} catch (Exception e) {
			return customException(e);
		}
	} 

}
