package com.example.demo.dto.custom;

import java.sql.Timestamp;
import java.util.Date;

public class AsignacionTareasCrudDto {

	private String idTarea;
	private Integer idUsuario;
	private Double porcentajeAsignacion;
	private Timestamp fechaInicio;
	private Timestamp fechaFin;
	private Integer idProyecto;
	private String nombreUsuario;
	public String getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Double getPorcentajeAsignacion() {
		return porcentajeAsignacion;
	}
	public void setPorcentajeAsignacion(Double porcentajeAsignacion) {
		this.porcentajeAsignacion = porcentajeAsignacion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public Timestamp getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Timestamp fechaFin) {
		this.fechaFin = fechaFin;
	}
	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	
	
}
