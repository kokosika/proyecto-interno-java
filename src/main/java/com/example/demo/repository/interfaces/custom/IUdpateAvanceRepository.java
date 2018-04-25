package com.example.demo.repository.interfaces.custom;

import com.example.demo.dto.custom.UpdateAvanceDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IUdpateAvanceRepository extends IBaseRepository{
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public void updateAvance(UpdateAvanceDto avance);
}
