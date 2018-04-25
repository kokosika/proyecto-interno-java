package com.example.demo.dto.custom;

import java.sql.Date;

public class ProyectoInfoDto {
	private String idProyecto;
	private String nombreProyecto;
	private String descripcionProyecto;
	private Date fechaInicio;
	private Date fechaFin;
	private Double porcentajeAvance;
	private String porcentajeEsperado;
	private String nombreCargo;
	private String userJP;
	private String userEC;
	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public String getDescripcionProyecto() {
		return descripcionProyecto;
	}
	public void setDescripcionProyecto(String descripcionProyecto) {
		this.descripcionProyecto = descripcionProyecto;
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
	public String getPorcentajeEsperado() {
		return porcentajeEsperado;
	}
	public void setPorcentajeEsperado(String porcentajeEsperado) {
		this.porcentajeEsperado = porcentajeEsperado;
	}
	public String getNombreCargo() {
		return nombreCargo;
	}
	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}
	public String getUserJP() {
		return userJP;
	}
	public void setUserJp(String userJP) {
		this.userJP = userJP;
	}
	public String getUserEC() {
		return userEC;
	}
	public void setUserEc(String userEC) {
		this.userEC = userEC;
	}
	
	

}
