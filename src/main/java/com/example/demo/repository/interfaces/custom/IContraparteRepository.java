package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.util.ComboDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IContraparteRepository extends IBaseRepository {
	
	public List<ComboDto> getComboContraparte(Integer idCliente);

}
