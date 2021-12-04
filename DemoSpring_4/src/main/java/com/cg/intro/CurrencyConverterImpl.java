package com.cg.intro;
public class CurrencyConverterImpl implements CurrencyConverter {
	
	private ExchangeService ex;
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}

	

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");		
		return ex;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");		
		this.ex = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * ex.getExchangeRate();
	}
};