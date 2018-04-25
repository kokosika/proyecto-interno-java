package com.example.demo.service.services.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.ClientePorcentajeEtapasProyectoDto;
import com.example.demo.dto.custom.DashboardClienteDto;
import com.example.demo.dto.custom.EtapaProyectoDto;
import com.example.demo.repository.interfaces.custom.IEtapaProyectoRepositorio;
import com.example.demo.repository.interfaces.custom.IInfoClienteRepository;
import com.example.demo.service.interfaces.custom.IInfoClienteService;
import com.example.demo.service.services.BaseService;

@Service
public class InfoClienteService  extends BaseService implements IInfoClienteService{
	
	@Autowired
	private IInfoClienteRepository infoClienteRepositort;
	@Autowired
	private IEtapaProyectoRepositorio etapaRepo;
	
	public ResponseEntity<GenericResponse> getAllInfoCliente(String id){
		try {
			return ok(this.infoClienteRepositort.getInfoCliente(id));
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> getPorcentajeClienteProyecto (){
		try {
			return ok(this.infoClienteRepositort.getPorcentajeClienteProyecto());
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> getComboCliente (){
		try {
			return ok(this.infoClienteRepositort.getComboCliente());
		} catch (Exception e) {
			return customException(e);
		}
	}
	public ResponseEntity<GenericResponse> getClientePorentajeEtapasProyecto (String idCliente, String idContraparte){
		try {	
			Integer cliente;
			Integer contraparte;
			try {
				cliente = (idCliente == null)? null: Integer.parseInt(idCliente);
			} catch (Exception e) {
				cliente = null;
			}
			try {
				contraparte = (idContraparte == null)? null: Integer.parseInt(idContraparte);
			} catch (Exception e) {
				contraparte = null;
			}			
			int totalProyectos = Integer.parseInt(this.infoClienteRepositort.getTotalDeProyectosDelCliente(cliente, contraparte).getData());
			List<EtapaProyectoDto> estapas = this.etapaRepo.getAllEtapaProyecto();
			List<ClientePorcentajeEtapasProyectoDto> clienteEtapas = this.infoClienteRepositort.getClientePorentajeEtapasProyecto(cliente, contraparte);			
			List<DashboardClienteDto> resultado = new ArrayList<DashboardClienteDto>();			
			for (EtapaProyectoDto etapa : estapas) {
				int contadorEtapas = 0;
				for (ClientePorcentajeEtapasProyectoDto clienteEtapa : clienteEtapas) {
					if(etapa.getEtapaProyectoId() == clienteEtapa.getIdEtapa()) {
						contadorEtapas++;
					}
				}
				DashboardClienteDto temp = new DashboardClienteDto();
				temp.setNombreCliente(etapa.getNombre());
				temp.setPorcentaje(Double.valueOf(contadorEtapas * 100 / totalProyectos));
				resultado.add(temp);
			}			
			return ok(resultado);
		} catch (Exception e) {
			return customException(e);
		}
	}
}
