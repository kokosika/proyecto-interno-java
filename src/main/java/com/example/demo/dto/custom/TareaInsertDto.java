package com.example.demo.dto.custom;

import java.util.Date;

public class TareaInsertDto {

	private String idTarea;
	private Integer idProyecto;
	private String nombreTarea;
	private Date fechaInicioTarea;
	private Date fechaTerminoTarea;
	private Double porcAvanceTarea;
	private String dependencia;
	private Date fechaInicioLb;
	private Date fechaTerminoTb;
	private Integer nivel;
	private Integer mile;
	private Integer groupP;
	private Integer parent;
	private Integer open;
	private String porcentajeEsperado;
	private Integer estadoKamban;
	
	
	public Integer getEstadoKamban() {
		return estadoKamban;
	}
	public void setEstadoKamban(Integer estadoKamban) {
		this.estadoKamban = estadoKamban;
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
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
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
	public Double getPorcAvanceTarea() {
		return porcAvanceTarea;
	}
	public void setPorcAvanceTarea(Double porcAvanceTarea) {
		this.porcAvanceTarea = porcAvanceTarea;
	}
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	public Date getFechaInicioLb() {
		return fechaInicioLb;
	}
	public void setFechaInicioLb(Date fechaInicioLb) {
		this.fechaInicioLb = fechaInicioLb;
	}
	public Date getFechaTerminoTb() {
		return fechaTerminoTb;
	}
	public void setFechaTerminoTb(Date fechaTerminoTb) {
		this.fechaTerminoTb = fechaTerminoTb;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Integer getMile() {
		return mile;
	}
	public void setMile(Integer mile) {
		this.mile = mile;
	}
	public Integer getGroupP() {
		return groupP;
	}
	public void setGroupP(Integer groupP) {
		this.groupP = groupP;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public Integer getOpen() {
		return open;
	}
	public void setOpen(Integer open) {
		this.open = open;
	}
	public String getPorcentajeEsperado() {
		return porcentajeEsperado;
	}
	public void setPorcentajeEsperado(String porcentajeEsperado) {
		this.porcentajeEsperado = porcentajeEsperado;
	}
	
	
	
	
	
}
