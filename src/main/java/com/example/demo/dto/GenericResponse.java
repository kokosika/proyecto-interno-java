package com.example.demo.dto;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class GenericResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String title;
	public Object data;
	public HttpStatus http;
	public Object trace;
}
