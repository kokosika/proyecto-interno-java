package com.example.demo.api.rest.custom;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GenericResponse;
import com.example.demo.dto.custom.PathDocDto;
import com.example.demo.repository.interfaces.custom.ICustomRepository;
import com.example.demo.repository.interfaces.custom.IPathDocRepository;
import com.example.demo.service.interfaces.custom.IPathDocService;

@RestController
@RequestMapping(value = "api/path-doc")
public class PathDocRestController {

	@Autowired
	private IPathDocService pathService;
	@Autowired
	private IPathDocRepository pathRepo;
	@Autowired
	private ICustomRepository customRepo;


	@PostMapping(value = "/xml")
	public void getPathPorProyectoNombreXML(@RequestBody Integer data, HttpServletResponse response) {

		FileInputStream os = null;
		try {			
			response.addHeader("Content-disposition", "attachment;filename=gantt.xml");
			PathDocDto doc = this.pathRepo.getPathPorProyectoNombreXML(data, customRepo.getNombreProyecto(data).getData()).get(0);
			os = new FileInputStream(doc.getPath());			 
			response.setContentType("txt/xml");
			IOUtils.copy(os, response.getOutputStream());
			response.flushBuffer();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {				
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@PostMapping(value = "/mpp")
	public void getPathPorProyectoNombreMPP(@RequestBody Integer data, HttpServletResponse response) {	
		FileInputStream os = null;
		try {			
			response.addHeader("Content-disposition", "attachment;filename=gantt.mpp");
			response.setContentType("txt/mpp");
			PathDocDto doc = this.pathRepo.getPathPorProyectoNombreMPP(data, customRepo.getNombreProyecto(data).getData()).get(0);
			os = new FileInputStream(doc.getPath());		
			IOUtils.copy(os, response.getOutputStream());
			response.flushBuffer();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@GetMapping(value = "/nombre")
	public ResponseEntity<GenericResponse> getNombreMimeProyecto(Integer data) {
		return this.pathService.getNombreMimeProyecto(data);
	}

}
