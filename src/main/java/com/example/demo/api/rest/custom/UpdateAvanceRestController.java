package com.example.demo.api.rest.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.UpdateAvanceDto;
import com.example.demo.service.interfaces.custom.IUpdateAvanceService;

@RestController
@RequestMapping(value = "api/updateavances")
public class UpdateAvanceRestController {
	@Autowired
	private IUpdateAvanceService assigServiceUpdateAvance;
	
	@PostMapping
	public ResponseEntity<GenericResponse> updateAvance(@RequestBody UpdateAvanceDto avance){
		return this.assigServiceUpdateAvance.updateAvance(avance);
	}
}
