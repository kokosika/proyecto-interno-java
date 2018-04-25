package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.UsuarioXOcupacionDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IUsuarioXOcupacionRepository extends IBaseRepository{
	
	public List<UsuarioXOcupacionDto> getAllUsuarioOcupacion();

}
