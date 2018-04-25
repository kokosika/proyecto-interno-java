package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.ProbRiesgoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IProbRiesgoRepository extends IBaseRepository{
	public List<ProbRiesgoDto> getProbRiesgos();

}
