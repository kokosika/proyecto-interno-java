package com.example.demo.repository.repository.custom;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.AllUserDto;
import com.example.demo.repository.interfaces.custom.IAllUserRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class AllUserRepository extends BaseRepository implements IAllUserRepository{
	
	@SuppressWarnings("unchecked")
	public List<AllUserDto> getAllUserOcu(){
		return (List<AllUserDto>) executeList(AllUserDto.class, "PRC_ALL_USUARIOS_X_CARGO");
		
	}

}
