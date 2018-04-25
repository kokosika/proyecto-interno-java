package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.OccupationDto;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IOccupationRepository extends IBaseRepository {

	public List<OccupationDto> getAllOccupation();

	public List<ComboDto> getComboAllOccupation();

	public List<OccupationDto> getOccupationByKey(OccupationFilterDto filter);

	public List<ComboDto> getConsultarCargos(Integer consultar);

}
