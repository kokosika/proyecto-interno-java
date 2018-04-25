package com.example.demo.api.rest.custom;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.GenericResponse;
import com.example.demo.service.interfaces.custom.ISubirArchivosService;;

@RequestMapping("api/subir")
@RestController
public class SubirArchivosRestController {
	@Autowired
	private ISubirArchivosService srvArchivos;

	@PostMapping()
	public ResponseEntity<GenericResponse> subir(@RequestParam Integer id, @RequestParam MultipartFile file) {
		try {
			return this.srvArchivos.guardarArchivos(file.getInputStream(), id, file);
			// FileOutputStream myStream =
			// this.srvArchivos.guardarArchivos(file.getInputStream(), id , file);
			// response.addHeader("Content-disposition",
			// "attachment;filename=myfilename.xml");
			// response.setContentType("txt/xml");

			// Copy the stream to the response's output stream.
			// IOUtils.copy(this.srvArchivos.guardarArchivos(file.getInputStream(), id ,
			// file) , response.getOutputStream());
			//response.flushBuffer();

		} catch (IOException e) {
			return new ResponseEntity<GenericResponse>(HttpStatus.CONFLICT);
		}

	}

	@GetMapping
	public Object subir() {
		try {
			/*
			 * File file = new File("C:\\Users\\Franco\\Downloads\\TEst1.mpp");
			 * ProjectReader reader = new MPPReader(); ProjectFile project =
			 * reader.read(file);
			 * 
			 * for (Task task : project.getAllTasks()) { System.out.println("Task: " +
			 * task.getName() + " ID=" + task.getID() + " Unique ID=" + task.getUniqueID());
			 * 
			 * }
			 */
			System.out.println(new File(".").getAbsolutePath());

			return "ok";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
