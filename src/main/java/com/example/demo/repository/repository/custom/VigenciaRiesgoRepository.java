package com.example.demo.repository.repository.custom;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.dto.custom.VigenciaRiesgoDto;
import com.example.demo.repository.interfaces.custom.IVigenciaRiesgoRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class VigenciaRiesgoRepository extends BaseRepository implements IVigenciaRiesgoRepository {
	
	@SuppressWarnings("unchecked")
	public List<VigenciaRiesgoDto> getVigenciasRiesgos(){
		return ( List<VigenciaRiesgoDto>) executeList(VigenciaRiesgoDto.class, "PRC_GET_VIG_RIESGO");
	}

}
