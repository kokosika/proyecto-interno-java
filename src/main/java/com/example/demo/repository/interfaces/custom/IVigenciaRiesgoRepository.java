package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.VigenciaRiesgoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IVigenciaRiesgoRepository extends IBaseRepository{
	
	public List<VigenciaRiesgoDto> getVigenciasRiesgos();

}
