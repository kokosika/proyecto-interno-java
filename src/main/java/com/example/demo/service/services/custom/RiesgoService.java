package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IRiesgoRepository;
import com.example.demo.service.interfaces.custom.IRiesgoService;
import com.example.demo.service.services.BaseService;
@Service
public class RiesgoService extends BaseService implements IRiesgoService{
	//debo decirle donde ir a buscar los datos del repositorio
	//de la interfaz
	@Autowired
	private IRiesgoRepository riesgoRepositorio;
	
	
	public ResponseEntity<GenericResponse> getAllRiesgo(String id){
		try {
			return ok(this.riesgoRepositorio.getRiegosPorProyectos(id));
		} catch (Exception e) {
			return customException(e);
		}
	} 
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	
	public ResponseEntity<GenericResponse> deleteRiesgo(Integer id){
		try {
			this.riesgoRepositorio.deleteRiesgo(id);
			return customResponse("ok", "eliminado", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return customException(e);
		}
	}	
}
