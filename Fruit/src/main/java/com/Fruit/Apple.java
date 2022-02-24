package com.Fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apple {

	private String appcolor;
	private int appamount;

	@Autowired
	private Growing Grow;

	public Growing getGrow() {
		return Grow;
	}

	@Autowired
	public void setGrow(Growing grow) {
		Grow = grow;
	}

	public Apple() {

	}


	public String getAppcolor() {
		return appcolor;
	}

	public void setAppcolor(String appcolor) {
		this.appcolor = appcolor;
	}

	public int getAppamount() {
		return appamount;
	}

	public void setAppamount(int appamount) {
		this.appamount = appamount;
	}



	
	

}
