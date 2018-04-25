package com.example.demo.service.interfaces.custom;

import java.io.InputStream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.IBaseService;

public interface ISubirArchivosService extends IBaseService {

	public final String PATH_JAVA = "C:\\jboss\\standalone\\deployments\\doc\\proyecto\\";
	public final String CUSTOM_PARAM = "% Completado Esperado";
	public ResponseEntity<GenericResponse> guardarArchivos(InputStream archivo, Integer id, MultipartFile multi);

}
