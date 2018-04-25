package com.example.demo.dto.custom;

import java.util.List;

public class OccupationDto {
	private Integer id;
	private String name;
	private Boolean expanded;
	private List<UserForOccupation> children;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public List<UserForOccupation> getChildren() {
		return children;
	}

	public void setChildren(List<UserForOccupation> children) {
		this.children = children;
	}

}
