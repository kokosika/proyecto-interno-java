package com.example.demo.repository.interfaces.custom;

import com.example.demo.dto.custom.ProyectoInfoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IProyectoInfoRepository extends IBaseRepository{
	
	public ProyectoInfoDto obtenerProyecto(String idProyecto);

}
