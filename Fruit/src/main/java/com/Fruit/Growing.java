package com.Fruit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Growing {

	private String gname;
	private String glocation;
	private double gtemperature;
	private String gseason;
	private boolean gontrees;

	private Growing() {

	}

	public void display() {
		System.out.println(" Fruit name = "+ gname + ", location = "+ glocation + ", temperature = " + gtemperature
				+ " degrees Fahrenheit"+ ", season = "+ gseason + "," + "Grow on trees " + gontrees);
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGlocation() {
		return glocation;
	}

	public void setGlocation(String glocation) {
		this.glocation = glocation;
	}

	public double getGtemperature() {
		return gtemperature;
	}

	public void setGtemperature(double gtemperature) {
		this.gtemperature = gtemperature;
	}

	public String getGseason() {
		return gseason;
	}

	public void setGseason(String gseason) {
		this.gseason = gseason;
	}

	public boolean isGontrees() {
		return gontrees;
	}

	public void setGontrees(boolean gontrees) {
		this.gontrees = gontrees;
	}

}