package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.dto.util.RangoFechasDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface ICustomRepository extends IBaseRepository {

	public List<ProyectDto> getAllProyect();

	public ProyectDto getPorcentProyect(Integer id);

	public List<ComboDto> getComboAllProyect();

	public StringDto getNombreProyecto(Integer id);

	public void guardarProyecto(ProyectDto dto);
	public void editarProyecto(ProyectDto dto);
	public RangoFechasDto rangoFechasTodosLosProyectos();

}
