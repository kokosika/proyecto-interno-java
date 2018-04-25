package com.example.demo.repository.interfaces.custom;

import com.example.demo.dto.custom.InsertAvanceDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IInsertAvanceRepository extends IBaseRepository{
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public void insertAvance(InsertAvanceDto avance);

}
