package com.Suresh.bussiness;

import org.springframework.stereotype.Component;

@Component
public class BussinessLogic {

	public void service( ) {
		System.out.println("From service method name " );
		throw new ArithmeticException();
	}
	
	public void helloInvoice() {
	System.out.println("hello invoice");
	}
	
	
	public void helloBye() {
		System.out.println("Bye All");
	}

	@Override
	public String toString() {
		return "BussinessLogic [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
