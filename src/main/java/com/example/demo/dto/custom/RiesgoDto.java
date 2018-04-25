package com.example.demo.dto.custom;

public class RiesgoDto {
	private Integer idRiesgo;
	private String nombreRiesgo;
	private String descripcionRiesgo;
	private String planDeMitigacion;
	private String planDeAcuerdos;
	private Integer idUsuario;
	private String identTipoUsuario;
	private String nombreResponsable;
	private String cargo;
	private Integer idProbRiesgo;
	private String probabilidadRiesgo;
	private Integer idVigRiesgo;
	private String vigenciaRiesgo;
	
	
	public String getIdentTipoUsuario() {
		return identTipoUsuario;
	}
	public void setIdentTipoUsuario(String identTipoUsuario) {
		this.identTipoUsuario = identTipoUsuario;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdProbRiesgo() {
		return idProbRiesgo;
	}
	public void setIdProbRiesgo(Integer idProbRiesgo) {
		this.idProbRiesgo = idProbRiesgo;
	}
	public Integer getIdVigRiesgo() {
		return idVigRiesgo;
	}
	public void setIdVigRiesgo(Integer idVigRiesgo) {
		this.idVigRiesgo = idVigRiesgo;
	}
	public String getProbabilidadRiesgo() {
		return probabilidadRiesgo;
	}
	public void setProbabilidadRiesgo(String probabilidadRiesgo) {
		this.probabilidadRiesgo = probabilidadRiesgo;
	}
	public String getVigenciaRiesgo() {
		return vigenciaRiesgo;
	}
	public void setVigenciaRiesgo(String vigenciaRiesgo) {
		this.vigenciaRiesgo = vigenciaRiesgo;
	}
	public Integer getIdRiesgo() {
		return idRiesgo;
	}
	public void setIdRiesgo(Integer idRiesgo) {
		this.idRiesgo = idRiesgo;
	}
	public String getNombreRiesgo() {
		return nombreRiesgo;
	}
	public void setNombreRiesgo(String nombreRiesgo) {
		this.nombreRiesgo = nombreRiesgo;
	}
	public String getDescripcionRiesgo() {
		return descripcionRiesgo;
	}
	public void setDescripcionRiesgo(String descripcionRiesgo) {
		this.descripcionRiesgo = descripcionRiesgo;
	}
	public String getPlanDeMitigacion() {
		return planDeMitigacion;
	}
	public void setPlanDeMitigacion(String planDeMitigacion) {
		this.planDeMitigacion = planDeMitigacion;
	}
	public String getPlanDeAcuerdos() {
		return planDeAcuerdos;
	}
	public void setPlanDeAcuerdos(String planDeAcuerdos) {
		this.planDeAcuerdos = planDeAcuerdos;
	}
	public String getNombreResponsable() {
		return nombreResponsable;
	}
	public void setNombreResponsable(String nombreResponsable) {
		this.nombreResponsable = nombreResponsable;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
