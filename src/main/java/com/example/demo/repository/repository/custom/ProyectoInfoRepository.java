package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.ProyectoInfoDto;
import com.example.demo.repository.interfaces.custom.IProyectoInfoRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class ProyectoInfoRepository extends BaseRepository implements IProyectoInfoRepository{
	
	@SuppressWarnings("unchecked")
	public ProyectoInfoDto obtenerProyecto(String idProyecto){
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_PROYECTO", idProyecto);
		List<ProyectoInfoDto> result = (List<ProyectoInfoDto>)executeList(ProyectoInfoDto.class, "PRC_INFOR_PROYECTO", parameters);
		if(result.isEmpty())
			return null;
		return result.get(0);
		
	}

}
