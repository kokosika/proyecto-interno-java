package com.example.demo.repository.repository.custom;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.util.ComboDto;
import com.example.demo.repository.interfaces.custom.IContraparteRepository;
import com.example.demo.repository.repository.BaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class ContraparteRepository extends BaseRepository implements IContraparteRepository {

	
	@SuppressWarnings("unchecked")
	public List<ComboDto> getComboContraparte(Integer idCliente){
		HashMap<String, Object> params = new HashMap<>();
		params.put("ID_CLIENTE", idCliente);
		return (List<ComboDto>) executeList(ComboDto.class, "PRC_GET_COMBO_CONTRAPARTE", params);
	}
}
