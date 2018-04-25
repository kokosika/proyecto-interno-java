package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.custom.OccupationDto;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.repository.interfaces.custom.IOccupationRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class OccupationRepository extends BaseRepository implements IOccupationRepository {

	@SuppressWarnings("unchecked")
	public List<OccupationDto> getAllOccupation() {
		return (List<OccupationDto>) executeList(OccupationDto.class, "PRC_CARGO");
	}

	@SuppressWarnings("unchecked")
	public List<ComboDto> getComboAllOccupation() {
		return (List<ComboDto>) executeList(ComboDto.class, "PRC_COMBO_CARGO");
	}

	@SuppressWarnings("unchecked")
	public List<OccupationDto> getOccupationByKey(OccupationFilterDto filter) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_CARGO", filter.getOccupationId());
		return (List<OccupationDto>) executeList(OccupationDto.class, "PRC_CARGO_FIND", params);
	}

	@SuppressWarnings("unchecked")
	public List<ComboDto> getConsultarCargos(Integer consultar) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("CONSULTAR", consultar);
		return (List<ComboDto>) executeList(ComboDto.class, "PRC_COMBO_JEFE_PROYECTO", params);
	}

}
