package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UserDto;
import com.example.demo.service.interfaces.IBaseService;

public interface IUserService extends IBaseService {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public ResponseEntity<GenericResponse> validateLogin(UserDto user);
	
	public ResponseEntity<GenericResponse> comboAllUsuarios();
	
	public ResponseEntity<GenericResponse> getUsuariosContraparte();
}
