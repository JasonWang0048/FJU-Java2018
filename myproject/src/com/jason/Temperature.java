package com.jason;

public class Temperature {
	double celsius;
	
	public Temperature(double celsius) {
		this.celsius = celsius;
	}
	
	public double fahreheit() {
		return (celsius * (9/5.0)) + 32;
	}
	
	public double kelvin() {
		return celsius + 273.15;
	}
}
