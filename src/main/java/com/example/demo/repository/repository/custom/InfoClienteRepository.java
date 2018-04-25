package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.ClientePorcentajeEtapasProyectoDto;
import com.example.demo.dto.custom.DashboardClienteDto;
import com.example.demo.dto.custom.InfoClienteDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.custom.IInfoClienteRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class InfoClienteRepository extends BaseRepository implements IInfoClienteRepository{
	
	@SuppressWarnings("unchecked")
	public InfoClienteDto getInfoCliente(String idProyecto){		
		
		HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("ID_PROYECTO", idProyecto);
		List<InfoClienteDto> result = (List<InfoClienteDto>)executeList(InfoClienteDto.class, "PRC_GET_INFO_CLIENTE", parameters);
		if(result.isEmpty())
			return null;
		return result.get(0);		
		
	}
	@SuppressWarnings("unchecked")
	public List<DashboardClienteDto> getPorcentajeClienteProyecto(){
		return (List<DashboardClienteDto>) executeList(DashboardClienteDto.class, "	PRC_GET_CLIENTE_PROCENTAJE_PROYECTO");
	}
	@SuppressWarnings("unchecked")
	public List<ComboDto> getComboCliente(){
		return (List<ComboDto>) executeList(ComboDto.class, "PRC_GET_COMBO_CLIENTE");
	}
	@SuppressWarnings("unchecked")
	public List<ClientePorcentajeEtapasProyectoDto> getClientePorentajeEtapasProyecto(Integer idCliente, Integer idContraparte){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_CLIENTE", idCliente);
		params.put("ID_CONTRAPARTE", idContraparte);
		return (List<ClientePorcentajeEtapasProyectoDto>) executeList(ClientePorcentajeEtapasProyectoDto.class, "PRC_GET_ETAPAS_PROYECTOS_CLIENTE", params);
	}
	@SuppressWarnings("unchecked")
	public StringDto getTotalDeProyectosDelCliente(Integer idCliente, Integer idContraparte) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_CLIENTE", idCliente);
		params.put("ID_CONTRAPARTE", idContraparte);
		List<StringDto> count = (List<StringDto>) executeList(StringDto.class,"	PRC_GET_CLIENTE_PROYECTOS",params);
		if(count.isEmpty()) {
			return null;
		}
		return count.get(0);
	}
}
