package com.example.demo.dto.custom;

import java.sql.Date;

public class TaskDto {

	private Integer pId;
	private String pName;
	private Date pStart;
	private Date pEnd;
	private Integer pMile;
	private String pRes;
	private Double pComp;
	private Integer pGroup;
	private Integer pParent;
	private Integer pOpen;
	private Integer pDepend;
	

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getpStart() {
		return pStart;
	}

	public void setpStart(Date pStart) {
		this.pStart = pStart;
	}

	public Date getpEnd() {
		return pEnd;
	}

	public void setpEnd(Date pEnd) {
		this.pEnd = pEnd;
	}

	public Integer getpMile() {
		return pMile;
	}

	public void setpMile(Integer pMile) {
		this.pMile = pMile;
	}

	public String getpRes() {
		return pRes;
	}

	public void setpRes(String pRes) {
		this.pRes = pRes;
	}

	public Double getpComp() {
		return pComp;
	}

	public void setpComp(Double pComp) {
		this.pComp = pComp;
	}

	public Integer getpGroup() {
		return pGroup;
	}

	public void setpGroup(Integer pGroup) {
		this.pGroup = pGroup;
	}

	public Integer getpParent() {
		return pParent;
	}

	public void setpParent(Integer pParent) {
		this.pParent = pParent;
	}

	public Integer getpOpen() {
		return pOpen;
	}

	public void setpOpen(Integer pOpen) {
		this.pOpen = pOpen;
	}

	public Integer getpDepend() {
		return pDepend;
	}

	public void setpDepend(Integer pDepend) {
		this.pDepend = pDepend;
	}

}
