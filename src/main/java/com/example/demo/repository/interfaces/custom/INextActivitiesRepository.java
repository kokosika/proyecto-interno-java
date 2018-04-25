package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.NextActivitiesDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface INextActivitiesRepository extends IBaseRepository{
	public List<NextActivitiesDto> getNextActivitiesPorProyecto(String idProyecto);
}
