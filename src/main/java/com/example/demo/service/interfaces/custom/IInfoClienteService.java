
package com.example.demo.service.interfaces.custom;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.IBaseService;

public interface IInfoClienteService extends IBaseService{
	
	public ResponseEntity<GenericResponse> getAllInfoCliente(String id);
	public ResponseEntity<GenericResponse> getPorcentajeClienteProyecto();
	public ResponseEntity<GenericResponse> getComboCliente ();
	public ResponseEntity<GenericResponse> getClientePorentajeEtapasProyecto (String idCliente, String idContraparte);

}
