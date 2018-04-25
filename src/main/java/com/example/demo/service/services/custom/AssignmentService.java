package com.example.demo.service.services.custom;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.AssegnamentDto;
import com.example.demo.dto.custom.OccupationDto;
import com.example.demo.dto.custom.UserForOccupation;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.repository.interfaces.custom.IAssegnamentRepository;
import com.example.demo.repository.interfaces.custom.IOccupationRepository;
import com.example.demo.repository.interfaces.custom.IUserRepository;
import com.example.demo.service.interfaces.custom.IAssignmentService;
import com.example.demo.service.services.BaseService;

@Service
public class AssignmentService extends BaseService implements IAssignmentService {

	@Autowired
	private IUserRepository userRepo;
	@Autowired
	private IOccupationRepository occupationRepo;
	@Autowired
	private IAssegnamentRepository asseRepo;

	public ResponseEntity<GenericResponse> getAllOcupationByProyect(Integer id) {
		try {
			List<OccupationDto> ocupation = this.occupationRepo.getAllOccupation();
			List<UserForOccupation> user = this.userRepo.getAllUserOcupationByProyect(id);
			for (int i = 0; i < ocupation.size(); i++) {
				List<UserForOccupation> result = new ArrayList<>();
				for (int j = 0; j < user.size(); j++) {
					if (ocupation.get(i).getId() == user.get(j).getId_cargo()) {
						result.add(user.get(j));
					}
				}
				if (!result.isEmpty()) {
					ocupation.get(i).setChildren(result);
				}
			}
			return ok(ocupation);
		} catch (Exception e) {
			return customException(e);
		}

	}

	private List<Date> getListaEntreFechas(Date fechaInicio, Date fechaFin) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(fechaInicio);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(fechaFin);
		List<Date> listaFechas = new ArrayList<Date>();
		while (!c1.after(c2)) {
			listaFechas.add(c1.getTime());
			c1.add(Calendar.DAY_OF_MONTH, 1);
		}
		return listaFechas;
	}

	public ResponseEntity<GenericResponse> getPorcenAsigForUser(Integer id) {
		try {
			List<AssegnamentDto> result = this.asseRepo.getAllAsegnamentProyectByProyect(id);
			List<AssegnamentDto> resultado = new ArrayList<AssegnamentDto>();
			int ids = 0;
			for (AssegnamentDto assegnamentDto : result) {
				List<Date> dates = getListaEntreFechas(assegnamentDto.getStart(), assegnamentDto.getEnd());
				for (Date date : dates) {
					ids++;
					AssegnamentDto dto = new AssegnamentDto();
					dto.setEnd(date);
					dto.setStart(date);
					dto.setId(ids);
					Integer porcentaje = Integer.parseInt(assegnamentDto.getText());
					dto.setResource(assegnamentDto.getResource());
					dto.setText(porcentaje.toString());
					resultado.add(dto);
				}
			}
			List<AssegnamentDto> otro = new ArrayList<AssegnamentDto>();
			for(AssegnamentDto ass : resultado) {
				boolean agregar = true;
				if(otro.isEmpty()) {
					agregar = false;
					otro.add(ass);
				}				
				for(int i = 0; i < otro.size(); i++) {
					if( otro.get(i).getResource().equals(ass.getResource())
						&& otro.get(i).getStart().equals(ass.getStart())						
						) {	
						agregar = false;
						if(otro.get(i).getId() != ass.getId()) {
							int porcentajeActual = Integer.parseInt(otro.get(i).getText());
							int porcentajeNuevo = Integer.parseInt(ass.getText());
							int suma = porcentajeActual + porcentajeNuevo;
							otro.get(i).setText(String.valueOf(suma));
							break;
						}
					}else {
						agregar = true;
					}
				}
				if(agregar) {
					otro.add(ass);
				}
			}
			return ok(otro);
		} catch (Exception e) {
			return customException(e);
		}
	}

	public ResponseEntity<GenericResponse> getAllOcupation(OccupationFilterDto data) {
		try {
			List<OccupationDto> ocupation = this.occupationRepo.getOccupationByKey(data);
			List<UserForOccupation> user = this.userRepo.getAllUserOcupation(data);
			for (int i = 0; i < ocupation.size(); i++) {
				List<UserForOccupation> result = new ArrayList<>();
				for (int j = 0; j < user.size(); j++) {
					if (ocupation.get(i).getId() == user.get(j).getId_cargo()) {
						result.add(user.get(j));
					}
				}
				if (!result.isEmpty()) {
					ocupation.get(i).setChildren(result);
				}
			}
			return ok(ocupation);
		} catch (Exception e) {
			return customException(e);
		}

	}

	public ResponseEntity<GenericResponse> getPorcenAsigForUserAll() {
		try {
			List<AssegnamentDto> result = this.asseRepo.getAllAsegnamentProyect();
			List<AssegnamentDto> resultado = new ArrayList<AssegnamentDto>();
			int ids = 0;
			for (AssegnamentDto assegnamentDto : result) {
				List<Date> dates = getListaEntreFechas(assegnamentDto.getStart(), assegnamentDto.getEnd());
				for (Date date : dates) {
					ids++;
					AssegnamentDto dto = new AssegnamentDto();
					dto.setEnd(date);
					dto.setStart(date);
					dto.setId(ids);
					Integer porcentaje = Integer.parseInt(assegnamentDto.getText());
					dto.setResource(assegnamentDto.getResource());
					dto.setText(porcentaje.toString());
					resultado.add(dto);
				}
			}
			List<AssegnamentDto> otro = new ArrayList<AssegnamentDto>();
			for(AssegnamentDto ass : resultado) {
				boolean agregar = true;
				if(otro.isEmpty()) {
					agregar = false;
					otro.add(ass);
				}				
				for(int i = 0; i < otro.size(); i++) {
					if( otro.get(i).getResource().equals(ass.getResource())
						&& otro.get(i).getStart().equals(ass.getStart())						
						) {	
						agregar = false;
						if(otro.get(i).getId() != ass.getId()) {
							int porcentajeActual = Integer.parseInt(otro.get(i).getText());
							int porcentajeNuevo = Integer.parseInt(ass.getText());
							int suma = porcentajeActual + porcentajeNuevo;
							otro.get(i).setText(String.valueOf(suma));
							break;
						}
					}else {
						agregar = true;
					}
				}
				if(agregar) {
					otro.add(ass);
				}
			}
			return ok(otro);
		} catch (Exception e) {
			return customException(e);
		}
	}
}
