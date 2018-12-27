package com.hsk.angeldoctor.web.hospital.controller;

import java.util.List;

import com.hsk.angeldoctor.api.persistence.AgWorkModelGx;

public class SaveWorkModel {

	
	private String name;
	private List<AgWorkModelGx> plans;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<AgWorkModelGx> getPlans() {
		return plans;
	}
	public void setPlans(List<AgWorkModelGx> plans) {
		this.plans = plans;
	}
	
	
}
