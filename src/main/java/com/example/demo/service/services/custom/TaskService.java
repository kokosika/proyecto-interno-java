package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.ITaskRepository;
import com.example.demo.service.interfaces.custom.ITaskService;
import com.example.demo.service.services.BaseService;

@Service
public class TaskService extends BaseService implements ITaskService {

	@Autowired
	private ITaskRepository repository;

	public ResponseEntity<GenericResponse> getAllTask(Integer id) {
		try {
			if (id == null)
				return error("Id nulo", "El id de proyecto no puede ser null");
			return ok(this.repository.getAllTask(id));
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> getAllTareas(){
		try {
			return ok(this.repository.getAllTareas());
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> updatePorcentajeKambanTarea(Double porcentaje, String idTarea, Integer idProyecto){
		try { 
			this.repository.updatePorcentajeKambanTarea(porcentaje, idTarea, idProyecto);
			return ok();
		} catch (Exception e) {
			return customException(e);
		}
	} 
}
