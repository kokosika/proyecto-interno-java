package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.IInfoClienteService;

@RestController
@RequestMapping(value = "api/clientes")

public class InfoClienteRestController {
	@Autowired
	private IInfoClienteService infoClienteService;
	
	@GetMapping
	public ResponseEntity<GenericResponse> getAllInfoCliente(String data) {
		return this.infoClienteService.getAllInfoCliente(data);
	}
	
	@GetMapping(value = "/cliente-porcentaje-proyecto")
	public ResponseEntity<GenericResponse> getPorcentajeClienteProyecto(){
		return this.infoClienteService.getPorcentajeClienteProyecto();
	}
	
	@GetMapping(value= "/combo-cliente")
	public ResponseEntity<GenericResponse> getComboCliente(){
		return this.infoClienteService.getComboCliente();
	}
	
	@GetMapping(value= "/cliente-etapa-proyecto")
	public ResponseEntity<GenericResponse> getClientePorentajeEtapasProyecto(String idCliente, String idContraparte){
		return this.infoClienteService.getClientePorentajeEtapasProyecto(idCliente, idContraparte);
	}

}
