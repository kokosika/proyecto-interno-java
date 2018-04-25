package com.example.demo.service.services.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.repository.interfaces.custom.IAllUserRepository;
import com.example.demo.service.interfaces.custom.IAllUserService;
import com.example.demo.service.services.BaseService;

@Service
public class AllUserService extends BaseService implements IAllUserService{
	@Autowired
	private IAllUserRepository allRepo;
	
	public ResponseEntity<GenericResponse> getAllUserOcu(){
		try {
			return ok(this.allRepo.getAllUserOcu());
		} catch (Exception e) {
			return customException(e);
		}
	}
	
}
