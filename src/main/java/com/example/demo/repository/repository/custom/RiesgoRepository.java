package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.RiesgoDto;
import com.example.demo.repository.interfaces.custom.IRiesgoRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class RiesgoRepository extends BaseRepository implements IRiesgoRepository{
	
	@SuppressWarnings("unchecked")
	public List<RiesgoDto> getRiegosPorProyectos(String idProyecto){
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_PROYECTO", idProyecto);
		return (List<RiesgoDto>) executeList(RiesgoDto.class, "PRC_RIESGOS_X_PROYECTOS",parameters);
	}

	public void deleteRiesgo(Integer idRiesgo) {
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_RIESGO", idRiesgo);
		execute("PRC_DELETE_RIESGO", parameters);
	}

}
