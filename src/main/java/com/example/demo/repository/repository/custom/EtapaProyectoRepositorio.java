package com.example.demo.repository.repository.custom;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.EtapaProyectoDto;
import com.example.demo.repository.interfaces.custom.IEtapaProyectoRepositorio;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class EtapaProyectoRepositorio extends BaseRepository implements IEtapaProyectoRepositorio {

	@SuppressWarnings("unchecked")
	public List<EtapaProyectoDto> getAllEtapaProyecto(){
		return (List<EtapaProyectoDto>) executeList(EtapaProyectoDto.class, "PRC_GET_ETAPAS_PROYECTO");
	}
	
}
