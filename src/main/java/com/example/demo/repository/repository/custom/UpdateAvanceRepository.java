package com.example.demo.repository.repository.custom;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.UpdateAvanceDto;
import com.example.demo.repository.interfaces.custom.IUdpateAvanceRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class UpdateAvanceRepository extends BaseRepository implements IUdpateAvanceRepository{
	/**
	 * 
	 * @param avance
	 * @return
	 */
	public void updateAvance(UpdateAvanceDto avance) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_AVANCE_PROYECTO", avance.getIdAvanceProyecto());
		//System.out.println(avance.getIdAvanceProyecto());
		params.put("ID_PROYECTO", avance.getIdProyecto());
		//System.out.println(avance.getIdProyecto());
		params.put("FECHA", avance.getFechaAvance());
		//System.out.println(avance.getFecha()); 
		params.put("PORCENTAJE_AVANCE", avance.getPorcentajeAvance());
		//System.out.println(avance.getPorcentajeAvance());
		params.put("PORCENTAJE_ESPERADO", avance.getPorcentajeEsperado());
		//System.out.println(avance.getPorcentajeEsperado());
		params.put("DESCRIPCION", avance.getDescripcion());
		//System.out.println(avance.getDescripcion());
		params.put("DIAS_ATRASO", avance.getDiasAtraso());
		execute("PRC_UPDATE_AVANCE", params);
	}
}
