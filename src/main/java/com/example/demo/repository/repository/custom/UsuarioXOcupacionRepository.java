package com.example.demo.repository.repository.custom;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.UsuarioXOcupacionDto;
import com.example.demo.repository.interfaces.custom.IUsuarioXOcupacionRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class UsuarioXOcupacionRepository extends BaseRepository implements IUsuarioXOcupacionRepository{
	
	@SuppressWarnings("unchecked")
	public List<UsuarioXOcupacionDto> getAllUsuarioOcupacion(){
		return (List<UsuarioXOcupacionDto>) executeList(UsuarioXOcupacionDto.class, "PRC_All_USUARIO_X_CARGO");
	}

}
