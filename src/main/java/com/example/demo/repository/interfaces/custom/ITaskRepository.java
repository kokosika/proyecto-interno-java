package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.TareaInsertDto;
import com.example.demo.dto.custom.TaskDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface ITaskRepository extends IBaseRepository {

	public List<TaskDto> getAllTask(Integer id);
	public void guardarTarea(TareaInsertDto dto);
	public StringDto validarTareaParaUpdateOInsert(TareaInsertDto dto) ;
	public void editarTarea(TareaInsertDto dto);
	public List<TareaInsertDto> getAllTareas();
	public void borrarTareasPorProyecto(Integer idProyecto);
	public void updatePorcentajeKambanTarea(Double porcentaje, String idTarea, Integer idProyecto);
}
