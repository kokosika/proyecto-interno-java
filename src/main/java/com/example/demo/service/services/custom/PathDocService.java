package com.example.demo.service.services.custom;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.PathDocDto;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.repository.interfaces.custom.IPathDocRepository;
import com.example.demo.service.interfaces.custom.IPathDocService;
import com.example.demo.service.services.BaseService;

@Service
public class PathDocService extends BaseService implements IPathDocService {

	@Autowired
	private IPathDocRepository pathRepo;
	@Autowired
	private ICustomRepository customRepo;

	/**
	 * 
	 * @param idProyecto
	 * @param nombreProyecto
	 * @return
	 */
	public FileInputStream getPathPorProyectoNombreXML(Integer idProyecto) {
		FileInputStream os = null;
		try {			
			PathDocDto doc = this.pathRepo.getPathPorProyectoNombreXML(idProyecto, customRepo.getNombreProyecto(idProyecto).getData()).get(0);
			os = new FileInputStream(doc.getPath());
			return os;
		} catch (Exception e) {
			return null;
		} finally {
			
		}
	}

	/**
	 * 
	 * @param idProyecto
	 * @param nombreProyecto
	 * @return
	 */
	public FileInputStream getPathPorProyectoNombreMPP(Integer idProyecto) {
		FileInputStream os = null;
		try {			
			PathDocDto doc = this.pathRepo.getPathPorProyectoNombreMPP(idProyecto, customRepo.getNombreProyecto(idProyecto).getData()).get(0);
			os = new FileInputStream(doc.getPath());
			return os;
		} catch (Exception e) {
			return null;
		} 
	}
	
	public ResponseEntity<GenericResponse> getNombreMimeProyecto(Integer idProyecto){
		try {
			return ok(this.pathRepo.getPathPorProyectoNombreMPP(idProyecto, this.customRepo.getNombreProyecto(idProyecto).getData()).get(0));
		} catch (Exception e) {
			return customException(e);
		}
	}

}
