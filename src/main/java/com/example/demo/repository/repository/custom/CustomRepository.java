package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.custom.ProyectDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.dto.util.RangoFechasDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class CustomRepository extends BaseRepository implements ICustomRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<ProyectDto> getAllProyect() {
		return (List<ProyectDto>) executeList(ProyectDto.class, "PRC_PROYECTOS");
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProyectDto getPorcentProyect(Integer id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		List<ProyectDto> result = (List<ProyectDto>) executeList(ProyectDto.class, "PRC_GET_PORCENTAJE_PROYE", params);
		if (result.isEmpty())
			return null;
		return result.get(0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ComboDto> getComboAllProyect() {
		return (List<ComboDto>) executeList(ComboDto.class, "PRC_COMBO_PROYECTO");
	}

	@Override
	public StringDto getNombreProyecto(Integer id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", id);
		return (StringDto) executeList(StringDto.class, "PRC_GET_NOMBRE_PROYECTO", params).get(0);
	}

	public void guardarProyecto(ProyectDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("NOMBRE", dto.getNombreProyecto());
		params.put("DESCRIPCION", dto.getDescripcion());
		params.put("FECHA_INICIO", dto.getFechaInicio());
		params.put("FECHA_FIN", dto.getFechaFin());
		params.put("PORCENTAJE", dto.getPorcentajeAvance());
		params.put("USER_JP", Integer.parseInt(dto.getUserJP()));
		params.put("USER_EC", Integer.parseInt(dto.getUserEC()));
		params.put("id_cliente", Integer.parseInt(dto.getIdCliente()));
		params.put("ID_CONTRAPARTE", Integer.parseInt(dto.getIdContraparte()));
		execute("PRC_INS_PROYECTO", params);
	}
	
	public void editarProyecto(ProyectDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", dto.getIdProyecto());
		params.put("FECHA_INICIO", dto.getFechaInicio());
		params.put("FECHA_FIN", dto.getFechaFin());
		params.put("PORCENTAJE_AVANCE", dto.getPorcentajeAvance());
		params.put("PORCENTAJE_ESPERADO", dto.getPorcentajeEsperado());
		execute("PRC_UPD_PROYECTO",params);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public RangoFechasDto rangoFechasTodosLosProyectos(){
		List<RangoFechasDto> rango = (List<RangoFechasDto>) executeList(RangoFechasDto.class, "PRC_GET_MAX_FECHAS_PROYECTOS");
		if(rango.isEmpty()) {
			return null;
		}
		return rango.get(0);
	}
}
