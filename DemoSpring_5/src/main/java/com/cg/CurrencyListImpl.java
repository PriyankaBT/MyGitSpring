package com.cg;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListImpl implements CurrencyList{
	
	private ArrayList<String> currList;

	@Override
	public ArrayList<String> getCurrList() {
		return currList;
	}

	// settert injection
	public void setCurrList(ArrayList<String> currList) {
		this.currList = currList;
	}
	

}
