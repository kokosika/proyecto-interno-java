package com.example.demo.dto.custom;

public class PathDocDto {

	private Integer pathDocId;
	private String path;
	private Integer proyectoIdFk;
	private String mime;
	private String nombre;

	public Integer getPathDocId() {
		return pathDocId;
	}

	public void setPathDocId(Integer pathDocId) {
		this.pathDocId = pathDocId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getProyectoIdFk() {
		return proyectoIdFk;
	}

	public void setProyectoIdFk(Integer proyectoIdFk) {
		this.proyectoIdFk = proyectoIdFk;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
