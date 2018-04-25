package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.RiesgoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IRiesgoRepository extends IBaseRepository{
	
	public List<RiesgoDto> getRiegosPorProyectos(String idProyecto);

	public void deleteRiesgo(Integer idRiesgo);

}
