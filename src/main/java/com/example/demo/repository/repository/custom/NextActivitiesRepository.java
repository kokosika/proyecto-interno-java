package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.NextActivitiesDto;
import com.example.demo.repository.interfaces.custom.INextActivitiesRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class NextActivitiesRepository extends BaseRepository implements INextActivitiesRepository{
	
	@SuppressWarnings("unchecked")
	public List<NextActivitiesDto> getNextActivitiesPorProyecto(String idProyecto){
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_PROYECTO", idProyecto);
		return (List<NextActivitiesDto>) executeList(NextActivitiesDto.class, "PRC_GET_ACTIVIDADES_PROXIMAS",parameters);		
	}

}
