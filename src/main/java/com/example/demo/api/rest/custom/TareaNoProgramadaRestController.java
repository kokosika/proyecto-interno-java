package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.OtraTareaDto;
import com.example.demo.service.interfaces.custom.ITareaNoProgramadaService;

@RestController
@RequestMapping(value = "api/tarea-no-programada")
public class TareaNoProgramadaRestController {

	@Autowired
	private ITareaNoProgramadaService tareaNoService;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getTodasLasNoTareas (){
		return this.tareaNoService.getTodasLasNoTareas();
	}
	
	@PostMapping
	public ResponseEntity<GenericResponse> guardarTareaNoProgramada(@RequestBody OtraTareaDto dto){
		return this.tareaNoService.guardarTareaNoProgramada(dto);
	}
	
}
