package com.example.demo.service.interfaces.custom;

import java.io.FileInputStream;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.IBaseService;

public interface IPathDocService extends IBaseService {

	/**
	 * 
	 * @param idProyecto
	 * @param nombreProyecto
	 * @return
	 */
	public FileInputStream getPathPorProyectoNombreXML(Integer idProyecto);
	public FileInputStream getPathPorProyectoNombreMPP(Integer idProyecto);
	public ResponseEntity<GenericResponse> getNombreMimeProyecto(Integer idProyecto);
}
