package com.example.demo.dto.custom;

import java.util.Date;

public class ProyectDto {

	private Integer idProyecto;
	private String nombreProyecto;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private Double porcentajeAvance;
	private String userJP;
	private String userEC;
	private String porcentajeEsperado;
	private String idCliente;
	private String idContraparte;
	

	public Integer getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getPorcentajeAvance() {
		return porcentajeAvance;
	}

	public void setPorcentajeAvance(Double porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}

	public String getUserJP() {
		return userJP;
	}

	public void setUserJP(String userJP) {
		this.userJP = userJP;
	}

	public String getUserEC() {
		return userEC;
	}

	public void setUserEC(String userEC) {
		this.userEC = userEC;
	}

	public String getPorcentajeEsperado() {
		return porcentajeEsperado;
	}

	public void setPorcentajeEsperado(String porcentajeEsperado) {
		this.porcentajeEsperado = porcentajeEsperado;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdContraparte() {
		return idContraparte;
	}

	public void setIdContraparte(String idContraparte) {
		this.idContraparte = idContraparte;
	}

	
}
