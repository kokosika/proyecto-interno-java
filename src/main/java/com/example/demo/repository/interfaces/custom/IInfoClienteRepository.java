package com.example.demo.repository.interfaces.custom;

import java.util.List;

import com.example.demo.dto.custom.ClientePorcentajeEtapasProyectoDto;
import com.example.demo.dto.custom.DashboardClienteDto;
import com.example.demo.dto.custom.InfoClienteDto;
import com.example.demo.dto.util.ComboDto;
import com.example.demo.dto.util.StringDto;
import com.example.demo.repository.interfaces.IBaseRepository;

public interface IInfoClienteRepository extends IBaseRepository{
	
	public InfoClienteDto getInfoCliente(String idProyecto);
	public List<DashboardClienteDto> getPorcentajeClienteProyecto();
	public List<ComboDto> getComboCliente();
	public List<ClientePorcentajeEtapasProyectoDto> getClientePorentajeEtapasProyecto(Integer idCliente, Integer idContraparte);
	public StringDto getTotalDeProyectosDelCliente(Integer idCliente, Integer idContraparte);
}
