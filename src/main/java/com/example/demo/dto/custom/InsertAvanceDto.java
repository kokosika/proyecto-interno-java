package com.example.demo.dto.custom;

import java.util.Date;

public class InsertAvanceDto {
	private String idProyecto;
	private Date fechaAvance;
	private Double porcentajeAvance;
	private Double porcentajeEsperado;
	private String descripcion;
	private Integer diasAtraso;
	
	public Integer getDiasAtraso() {
		return diasAtraso;
	}
	public void setDiasAtraso(Integer diasAtraso) {
		this.diasAtraso = diasAtraso;
	}
	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	public Date getFechaAvance() {
		return fechaAvance;
	}
	public void setFechaAvance(Date fechaAvance) {
		this.fechaAvance = fechaAvance;
	}
	public Double getPorcentajeAvance() {
		return porcentajeAvance;
	}
	public void setPorcentajeAvance(Double porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}
	public Double getPorcentajeEsperado() {
		return porcentajeEsperado;
	}
	public void setPorcentajeEsperado(Double porcentajeEsperado) {
		this.porcentajeEsperado = porcentajeEsperado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
		

}
