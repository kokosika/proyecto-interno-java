package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.OtraTareaDto;
import com.example.demo.repository.interfaces.custom.ITareaNoProgramadaRepositorio;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class TareaNoProgramadaRepositorio extends BaseRepository implements ITareaNoProgramadaRepositorio{

	
	@SuppressWarnings("unchecked")
	public List<OtraTareaDto> getTodasLasNoTareas(){
		return (List<OtraTareaDto>) executeList(OtraTareaDto.class, "PRC_GET_TAREAS_NO_PROG");
	}
	
	public void guardarTareaNoProgramada(OtraTareaDto dto) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("USUARIO_RECEPTOR", dto.getUsuarioReceptor());
		params.put("USUARIO_ENVIANTE", dto.getUsuarioEnviante());
		params.put("MENSAJE", dto.getMensaje());
		params.put("FECHA_TERMINO", dto.getFechaTermino());
		execute("PRC_INS_NO_TAREAS",params);
	}
}
