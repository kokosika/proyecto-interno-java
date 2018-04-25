package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.PathDocDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IPathDocRepository extends IBaseRepository {

	public void guardarPath(PathDocDto path);

	public List<PathDocDto> getPathPorProyectoNombreXML(Integer idProyecto, String nombreProyecto);

	public List<PathDocDto> getPathPorProyectoNombreMPP(Integer idProyecto, String nombreProyecto);

}
