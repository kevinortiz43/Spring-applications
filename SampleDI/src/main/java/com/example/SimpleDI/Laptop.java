package com.example.SimpleDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private String Cname;
	private double Cprice;

	@Autowired
	
	
	public Laptop() {
	}

	public void brandname(String string) {

	}


	public String setBrand() {
		return Cname;
		// TODO Auto-generated method stub
		
	}

}
