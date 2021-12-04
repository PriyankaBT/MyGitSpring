package com.cg.intro;

public class Greet {
	
	private String countryname;
	
//	public Greet(String c) {
//		this.countryname=c;
//	}
	
	

	public void greet() {
		System.out.println("Welcome to "+ countryname+"!!!");
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		System.out.println("--------------");
		this.countryname = countryname;
	}
	
}
