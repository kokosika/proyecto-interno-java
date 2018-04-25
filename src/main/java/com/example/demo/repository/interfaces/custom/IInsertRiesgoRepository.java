package com.example.demo.repository.interfaces.custom;

import com.example.demo.dto.custom.InsertRiesgoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IInsertRiesgoRepository extends IBaseRepository{
	/**
	 * 
	 * @param riesgo
	 * @return
	 */
	public void insertRiesgo(InsertRiesgoDto riesgo);

}
