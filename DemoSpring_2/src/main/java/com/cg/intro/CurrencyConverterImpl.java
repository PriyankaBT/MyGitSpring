package com.cg.intro;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	
	private double exchangeRate;// instance variable
	private String Unit;
	
	
	// no-arg constructor is required for SETTER INJECTION
	//
	public CurrencyConverterImpl() {
		System.out.println("no arg ");
	//exchangeRate=25;
	}
	
//	public CurrencyConverterImpl(double exchangeRate) {  //local scope
//		System.out.println("CurrencyConverterImpl()****1");
//		this.exchangeRate = exchangeRate;
//	}
//	
	// When parameterised constructor is given , JAVA wont create default constructor
	public CurrencyConverterImpl(double exchangeRate,String unit) {  //local scope
		System.out.println("CON WITH 2 ARG*****2");
		this.exchangeRate = exchangeRate;
		this.Unit=unit;
	}
	
//		
//	public CurrencyConverterImpl(String exchangeRate) {  // local
//		System.out.println("CurrencyConverterImpl() "
//				+ "string parameter ");
//		this.exchangeRate = Double.parseDouble(exchangeRate);
//	}
	

//	
//	
//	
//
//	public double getExchangeRate() {
//		System.out.println("getExchangeRate()");		
//		return exchangeRate;
//	}
//
//	public String getUnit() {
//		return Unit;
//	}

	// setter injection - xml property will call set methods
	public void setUnit(String unit) {
		System.out.println("****setter injection for property unit");
		Unit = unit;
	}

	// setter injection - xml property will call set methods
	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate()");		
		this.exchangeRate = exchangeRate;
	}

	@Override
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");
		System.out.println("ExRate= "+ this.exchangeRate +" "+this.Unit);
		return dollars * exchangeRate;
	}
}