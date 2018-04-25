package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.EtapaProyectoDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IEtapaProyectoRepositorio extends IBaseRepository {

	public List<EtapaProyectoDto> getAllEtapaProyecto();
}
