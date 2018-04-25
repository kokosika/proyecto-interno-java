package com.example.demo.dto.filter;

import java.sql.Date;

public class OccupationFilterDto {

	private Integer occupationId;
	private Integer proyectId;
	private Date dateFrom;
	private Date dateTo;

	public Integer getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Integer occupationId) {
		this.occupationId = occupationId;
	}

	public Integer getProyectId() {
		return proyectId;
	}

	public void setProyectId(Integer proyectId) {
		this.proyectId = proyectId;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

}
