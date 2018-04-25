package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.TareasDragDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface ITareasDragRepositorio extends IBaseRepository {

	public List<TareasDragDto> todasLasTareas(Double idProyecto);	
	public List<TareasDragDto> tareasPendientes(Double idProyecto);
	public List<TareasDragDto> tareasEnDesarrollo(Double idProyecto);
	public List<TareasDragDto> tareasTerminadas(Double idProyecto);
	public void updateEstadoKamban(TareasDragDto dto) ;
}
