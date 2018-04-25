package com.example.demo.repository.repository.custom;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.ProbRiesgoDto;
import com.example.demo.repository.interfaces.custom.IProbRiesgoRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class ProbRiesgoRepository  extends BaseRepository implements IProbRiesgoRepository{
	
	@SuppressWarnings("unchecked")
	public List<ProbRiesgoDto> getProbRiesgos(){
		return ( List<ProbRiesgoDto>) executeList(ProbRiesgoDto.class, "PRC_GET_PROB_RIESGO");
	}
	

}
