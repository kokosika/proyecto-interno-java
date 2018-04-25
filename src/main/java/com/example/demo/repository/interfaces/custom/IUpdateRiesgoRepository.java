package com.example.demo.repository.interfaces.custom;

import com.example.demo.dto.custom.UpdateRiesgoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IUpdateRiesgoRepository extends IBaseRepository{
	/**
	 * 
	 * @param riesgo
	 * @return
	 */
	public void updateRiesgo(UpdateRiesgoDto riesgo);

}
