package com.cg.intro;

public class ExchangeServiceImpl implements ExchangeService {

	private double exchangeRate;
	// constructor 
	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}
	
	@Override
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}
}
