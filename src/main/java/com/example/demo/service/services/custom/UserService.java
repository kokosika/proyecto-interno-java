package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UserDto;
import com.example.demo.repository.interfaces.custom.IUserRepository;
import com.example.demo.service.interfaces.custom.IUserService;
import com.example.demo.service.services.BaseService;

@Service
public class UserService extends BaseService implements IUserService {

	@Autowired
	private IUserRepository repo;

	/**
	 * 
	 * @param user
	 * @return
	 */
	public ResponseEntity<GenericResponse> validateLogin(UserDto user) {
		try {
			UserDto dto = this.repo.validateLogin(user);
			if (dto == null)
				return customResponse("No autorizado", "No se encuentra autorizado", HttpStatus.UNAUTHORIZED);
			else
				return customResponse("ok", "autorizado", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return customException(e);
		}

	}
	
	public ResponseEntity<GenericResponse> comboAllUsuarios(){
		try {
			return ok(this.repo.comboAllUsuarios());
		} catch (Exception e) {
			return customException(e);
		}
	}

	public ResponseEntity<GenericResponse> getUsuariosContraparte(){
		try {
			return ok(this.repo.getUsuariosContraparte());
		} catch (Exception e) {
			return customException(e);
		}
	}

}
