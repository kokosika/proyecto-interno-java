package com.example.demo.dto.custom;

import java.sql.Date;

public class TareasDragDto {
	private String idTarea;
	private Integer idProyecto;
	private String nombre;
	private Double porcentajeReal;
	private Double porcentajeEsperado;
	private String fase;
	private Integer estadoKamban;
	private Date fechaTermino;
	
	
	public Integer getEstadoKamban() {
		return estadoKamban;
	}
	public void setEstadoKamban(Integer estadoKamban) {
		this.estadoKamban = estadoKamban;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public String getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}
	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPorcentajeReal() {
		return porcentajeReal;
	}
	public void setPorcentajeReal(Double porcentajeReal) {
		this.porcentajeReal = porcentajeReal;
	}
	public Double getPorcentajeEsperado() {
		return porcentajeEsperado;
	}
	public void setPorcentajeEsperado(Double porcentajeEsperado) {
		this.porcentajeEsperado = porcentajeEsperado;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	
	
}
