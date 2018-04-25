package com.example.demo.dto.custom;

import java.util.Date;

public class OtraTareaDto {
	
	private Integer idTareaNoAsignada;
	private Integer usuarioReceptor;
	private Integer usuarioEnviante;
	private String mensaje;
	private String nombreUsuarioEnviante;
	private Date fechaCreacion;
	private Date fechaTermino;
	
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public Integer getIdTareaNoAsignada() {
		return idTareaNoAsignada;
	}
	public void setIdTareaNoAsignada(Integer idTareaNoAsignada) {
		this.idTareaNoAsignada = idTareaNoAsignada;
	}
	public Integer getUsuarioReceptor() {
		return usuarioReceptor;
	}
	public void setUsuarioReceptor(Integer usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}
	public Integer getUsuarioEnviante() {
		return usuarioEnviante;
	}
	public void setUsuarioEnviante(Integer usuarioEnviante) {
		this.usuarioEnviante = usuarioEnviante;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getNombreUsuarioEnviante() {
		return nombreUsuarioEnviante;
	}
	public void setNombreUsuarioEnviante(String nombreUsuarioEnviante) {
		this.nombreUsuarioEnviante = nombreUsuarioEnviante;
	}
	
	

}
