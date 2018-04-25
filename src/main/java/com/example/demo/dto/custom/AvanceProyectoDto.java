package com.example.demo.dto.custom;

import java.sql.Date;

public class AvanceProyectoDto {
	private Integer idAvanceProyecto;
	private Integer idProyecto;
	private Date fechaAvance;
	private Double porcentajeAvance;
	private Double porcentajeEsperado;
	private String descripcionAvance;
	private Integer diasAtraso;
	public Integer getDiasAtraso() {
		return diasAtraso;
	}
	public void setDiasAtraso(Integer diasAtraso) {
		this.diasAtraso = diasAtraso;
	}
	public String getDescripcionAvance() {
		return descripcionAvance;
	}
	public void setDescripcionAvance(String descripcionAvance) {
		this.descripcionAvance = descripcionAvance;
	}
	public Integer getIdAvanceProyecto() {
		return idAvanceProyecto;
	}
	public void setIdAvanceProyecto(Integer idAvanceProyecto) {
		this.idAvanceProyecto = idAvanceProyecto;
	}
	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
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
	

}
