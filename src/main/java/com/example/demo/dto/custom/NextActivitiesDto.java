package com.example.demo.dto.custom;

import java.sql.Date;

public class NextActivitiesDto {
	public String nombreEtapa;
	public String idTarea;
	public Date fechaInicioTarea;
	public Date fechaTerminoTarea;
	public String nombreTarea;
	public Integer nivelTarea;
	public String esDependencia;
	public String getNombreEtapa() {
		return nombreEtapa;
	}
	public void setNombreEtapa(String nombreEtapa) {
		this.nombreEtapa = nombreEtapa;
	}
	public String getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}
	public Date getFechaInicioTarea() {
		return fechaInicioTarea;
	}
	public void setFechaInicioTarea(Date fechaInicioTarea) {
		this.fechaInicioTarea = fechaInicioTarea;
	}
	public Date getFechaTerminoTarea() {
		return fechaTerminoTarea;
	}
	public void setFechaTerminoTarea(Date fechaTerminoTarea) {
		this.fechaTerminoTarea = fechaTerminoTarea;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public Integer getNivelTarea() {
		return nivelTarea;
	}
	public void setNivelTarea(Integer nivelTarea) {
		this.nivelTarea = nivelTarea;
	}
	public String getEsDependencia() {
		return esDependencia;
	}
	public void setEsDependencia(String esDependencia) {
		this.esDependencia = esDependencia;
	}
		

}
