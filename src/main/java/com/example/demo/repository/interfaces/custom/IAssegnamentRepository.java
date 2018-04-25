package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.AsignacionTareasCrudDto;
import com.example.demo.dto.custom.AssegnamentDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IAssegnamentRepository extends IBaseRepository {
	public List<AssegnamentDto> getAllAsegnamentProyectByProyect(Integer id);
	public List<AssegnamentDto> getAllAsegnamentProyect();
	
	public void guardarAsignacionTareas(AsignacionTareasCrudDto dto) ;
	public StringDto validarAsignacionParaEditar(AsignacionTareasCrudDto dto);
	public void editarAsignaciones(AsignacionTareasCrudDto dto);
	
}
