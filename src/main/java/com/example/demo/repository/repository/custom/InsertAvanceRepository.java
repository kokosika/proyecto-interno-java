package com.example.demo.repository.repository.custom;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.InsertAvanceDto;
import com.example.demo.repository.interfaces.custom.IInsertAvanceRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class InsertAvanceRepository extends BaseRepository implements IInsertAvanceRepository{
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public void insertAvance(InsertAvanceDto avance) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", avance.getIdProyecto());
		params.put("FECHA", avance.getFechaAvance());
		params.put("PORCENTAJE_AVANCE", avance.getPorcentajeAvance());
		params.put("PORCENTAJE_ESPERADO", avance.getPorcentajeEsperado());
		params.put("DESCRIPCION", avance.getDescripcion());
		params.put("DIAS_ATRASO", avance.getDiasAtraso());
		execute("PRC_INSERT_AVANCE", params);
	}
}
