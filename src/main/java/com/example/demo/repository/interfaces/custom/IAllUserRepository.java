package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.AllUserDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IAllUserRepository  extends IBaseRepository {
	
	public List<AllUserDto> getAllUserOcu();
}
