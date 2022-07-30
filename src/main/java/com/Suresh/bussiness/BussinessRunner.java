package com.Suresh.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BussinessRunner implements CommandLineRunner {

	@Autowired
	private BussinessLogic bussinessLogic;
	
	@Autowired
	private BussinessLogic2 bussinessLogic2;
	
	@Override
	public void run(String... args) throws Exception {
		bussinessLogic.service();
		bussinessLogic.helloInvoice();
		bussinessLogic.helloBye();
		
		bussinessLogic2.service2();
		bussinessLogic2.helloInvoice2();
		bussinessLogic2.helloBye2();
	}

}
