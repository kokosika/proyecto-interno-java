package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.OtraTareaDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface ITareaNoProgramadaRepositorio extends IBaseRepository {

	public List<OtraTareaDto> getTodasLasNoTareas();
	public void guardarTareaNoProgramada(OtraTareaDto dto) ;
}
