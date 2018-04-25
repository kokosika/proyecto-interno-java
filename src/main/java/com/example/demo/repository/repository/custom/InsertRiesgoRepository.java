package com.example.demo.repository.repository.custom;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.InsertRiesgoDto;
import com.example.demo.repository.interfaces.custom.IInsertRiesgoRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@Transactional
@EnableAutoConfiguration
public class InsertRiesgoRepository extends BaseRepository implements IInsertRiesgoRepository{
	
	/**
	 * 
	 * @param riesgo
	 * @return
	 */
	public void insertRiesgo(InsertRiesgoDto riesgo) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_PROYECTO", riesgo.getIdProyecto());
		params.put("NOMBRE_RIESGO", riesgo.getNombreRiesgo());
		params.put("DESCRIPCION_RIESGO", riesgo.getDescripcionRiesgo());
		params.put("PLAN_D_MITIGAC", riesgo.getPlanDeMitigacion());
		params.put("PLAN_D_ACUERDOS", riesgo.getPlanDeAcuerdos());
		params.put("ID_RESPONSABLE", riesgo.getNombreResponsable());
		params.put("IDENT_TIPO_USUARIO", riesgo.getIdentTipoUsuario());
		params.put("ID_PROB_RIESGO", riesgo.getProbabilidadRiesgo());
		params.put("ID_VIG_RIESGO", riesgo.getVigenciaRiesgo());		
		execute("PRC_INSERT_RIESGO", params);
		
	}
	

}
