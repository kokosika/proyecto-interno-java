package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.filter.OccupationFilterDto;
import com.example.demo.service.interfaces.custom.IAssignmentService;
import com.example.demo.service.interfaces.custom.IOccupationService;

@RestController
@RequestMapping(value = "api/ocupation")
public class OccupationRestController {

	@Autowired
	private IAssignmentService assigService;
	@Autowired
	private IOccupationService occupService;

	@GetMapping
	public ResponseEntity<GenericResponse> getAllOcupation(Integer data) {
		return this.assigService.getAllOcupationByProyect(data);
	}

	@PostMapping(value = "/get-all")
	public ResponseEntity<GenericResponse> getAllOcupation(@RequestBody OccupationFilterDto data) {
		return this.assigService.getAllOcupation(data);
	}

	@GetMapping(value = "/get-combo")
	public ResponseEntity<GenericResponse> getComboAllOccupation() {
		return this.occupService.getComboAllOccupation();
	}

	@PostMapping(value = "/get-find-by")
	public ResponseEntity<GenericResponse> getOccupationByKey(@RequestBody OccupationFilterDto data) {
		return this.occupService.getOccupationByKey(data);
	}

	@GetMapping(value = "/get-consultar")
	public ResponseEntity<GenericResponse> getConsultarCargos(Integer data) {
		return this.occupService.getConsultarCargos(data);
	}

}
