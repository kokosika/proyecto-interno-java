package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.AvanceProyectoDto;
import com.example.demo.dto.custom.DiasAtrasoDto;
import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.custom.IAvanceProyectoRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class AvanceRepository extends BaseRepository implements IAvanceProyectoRepository{
	
	@SuppressWarnings("unchecked")
	public List<AvanceProyectoDto> getAvancePorProyecto(String idProyecto){
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_PROYECTO", idProyecto);
		return (List<AvanceProyectoDto>) executeList(AvanceProyectoDto.class, "PRC_AVANCE_PROYECTO",parameters);
	}

@SuppressWarnings("unchecked")
	public DiasAtrasoDto obtenerDiasAtraso(String idProyecto){
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_PROYECTO", idProyecto);
		List<DiasAtrasoDto> result = (List<DiasAtrasoDto>)executeList(DiasAtrasoDto.class, "PRC_GET_DIAS_ATRASO_BY_LAST_RECORD", parameters);
		if(result.isEmpty())
			return null;
		return result.get(0);
		
	}
	
	public void deleteAvance(Integer idAvanceHistorico) {
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_AVANCE_HISTORICO", idAvanceHistorico);
		execute("PRC_DELETE_AVANCE_HISTORICO", parameters);
	}
	@SuppressWarnings("unchecked")
	public List<StringDto> getAvancesProyectosAlDia(){
		return (List<StringDto>) executeList(StringDto.class, "PRC_GET_AVANCE_PROYECTO_DIA");
	}
	
	@SuppressWarnings("unchecked")
	public List<StringDto> getAvancesProyectosAtrasados(){
		return (List<StringDto>) executeList(StringDto.class, "PRC_GET_AVANCE_PROYECTO_ATRASADO");
	}
	@SuppressWarnings("unchecked")
	public List<ProyectDto> getAvancesProyectosAtrasadosDetalle(){
		return (List<ProyectDto>) executeList(ProyectDto.class, "PRC_GET_AVANCE_ATRASADO_DETALLE");
	}
}
