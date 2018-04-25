package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IProyectoInfoRepository;
import com.example.demo.service.interfaces.custom.IProyectoInfoService;
import com.example.demo.service.services.BaseService;
@Service
public class ProyectoInfoService extends BaseService implements IProyectoInfoService{
	
	@Autowired
	public IProyectoInfoRepository proyectoInfoRepositorio;
	
	public ResponseEntity<GenericResponse> getInfoProyecto(String id){
		try {
			return ok(this.proyectoInfoRepositorio.obtenerProyecto(id));
		} catch (Exception e) {
			return customException(e);
		}
	}

}
