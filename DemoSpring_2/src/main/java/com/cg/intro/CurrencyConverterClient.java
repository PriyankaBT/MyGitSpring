package com.cg.intro;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {

		//Resource res = new ClassPathResource("currencyconverter.xml");

		//BeanFactory factory = new XmlBeanFactory(res);

		ApplicationContext factory = new ClassPathXmlApplicationContext("currencyconverter.xml");
		
		
		CurrencyConverterImpl obj = (CurrencyConverterImpl) factory.getBean("currencyConverter1");
		System.out.println("*****************************");
		System.out.println(obj.dollarsToRupees(3));
		System.out.println("*****************************");
		
		
		CurrencyConverterImpl ob = (CurrencyConverterImpl) factory.getBean("currencyConverter2");
		System.out.println("*****************************");
		System.out.println(ob.dollarsToRupees(3));
		System.out.println("*****************************");

		Greet obj1 = (Greet) factory.getBean("g1");
		obj1.greet();
		System.out.println(obj1.hashCode());
		
		//Greet obj2 = new Greet();
		Greet obj2 = (Greet) factory.getBean("g1");
		obj2.greet();
		System.out.println(obj2.hashCode());
		/*
		 * CurrencyConverter curr = (CurrencyConverter)
		 * factory.getBean("currencyConverter"); double rupees =
		 * curr.dollarsToRupees(50.0); System.out.println("50 $ is "+rupees+" Rs.");
		 */
	}
}
