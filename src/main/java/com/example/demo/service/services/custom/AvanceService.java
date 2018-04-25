package com.example.demo.service.services.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.util.GraficosDto;
import com.example.demo.repository.interfaces.custom.IAvanceProyectoRepository;
import com.example.demo.repository.interfaces.custom.IInfoClienteRepository;
import com.example.demo.service.interfaces.custom.IAvanceService;
import com.example.demo.service.services.BaseService;

@Service
public class AvanceService extends BaseService implements IAvanceService{
	
	@Autowired
	private IAvanceProyectoRepository avanceRepositorio;
	@Autowired
	private IInfoClienteRepository infoClienteRepositort;
	
	
	public ResponseEntity<GenericResponse> getAllAvance(String id){
		try {			
			return ok(this.avanceRepositorio.getAvancePorProyecto(id));
		} catch (Exception e) {
			return customException(e);
		}
	}

	public ResponseEntity<GenericResponse> getDiasAtraso(String id){
		try {
			return ok(this.avanceRepositorio.obtenerDiasAtraso(id));
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	
	public ResponseEntity<GenericResponse> deleteAvance(Integer id){
		try {
			this.avanceRepositorio.deleteAvance(id);;
			return customResponse("ok", "eliminado", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return customException(e);
		}
	}
	
	public ResponseEntity<GenericResponse> getAvancesProyectosPorEstadoPorcentaje(){
		try {
			Integer totalProyectos = Integer.parseInt(this.infoClienteRepositort.getTotalDeProyectosDelCliente(null, null).getData());
			Integer totalProyectosAlDia = this.avanceRepositorio.getAvancesProyectosAlDia().size();
			Integer totalProyectosAtrasados = this.avanceRepositorio.getAvancesProyectosAtrasados().size();			
			List<GraficosDto> resultado = new ArrayList<GraficosDto>();
			GraficosDto atrasados = new GraficosDto();
			atrasados.setLabels("Avances Atrasados");
			atrasados.setPorcentaje(Double.valueOf(totalProyectosAtrasados * 100 / totalProyectos));
			GraficosDto alDia = new GraficosDto();
			alDia.setLabels("Avances al Dia");
			alDia.setPorcentaje(Double.valueOf(totalProyectosAlDia * 100 / totalProyectos));
			resultado.add(atrasados);
			resultado.add(alDia);
			return ok(resultado);
		} catch (Exception e) {
			return customException(e);
		}
	} 
	
	public ResponseEntity<GenericResponse> getAvancesProyectosAtrasadosDetalle(){
		try {			
			return ok(this.avanceRepositorio.getAvancesProyectosAtrasadosDetalle());
		} catch (Exception e) {
			return customException(e);
		}
	}  

}
