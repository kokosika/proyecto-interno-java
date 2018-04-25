package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.AvanceProyectoDto;
import com.example.demo.dto.custom.DiasAtrasoDto;
import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IAvanceProyectoRepository extends IBaseRepository{
	public List<AvanceProyectoDto> getAvancePorProyecto(String idProyecto);
	
	public DiasAtrasoDto obtenerDiasAtraso(String idProyecto);
	
	public void deleteAvance(Integer idAvanceHistorico);
	public List<StringDto> getAvancesProyectosAlDia();	
	public List<StringDto> getAvancesProyectosAtrasados();
	public List<ProyectDto> getAvancesProyectosAtrasadosDetalle();
	
}
