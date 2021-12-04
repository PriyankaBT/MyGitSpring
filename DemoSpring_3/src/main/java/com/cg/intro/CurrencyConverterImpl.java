package com.cg.intro;
public class CurrencyConverterImpl implements CurrencyConverter {
	
	private ExchangeService exchangeService; // only declared
	
	// no-arg constructor
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}

	

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	// setter for ExchangeService 
	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	@Override
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};