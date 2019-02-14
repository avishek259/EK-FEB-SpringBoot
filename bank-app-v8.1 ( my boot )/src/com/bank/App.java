package com.bank;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.config.BankAppConfiguration;
import com.bank.service.TxrService;

public class App {

	public static void main(String[] args) {

		// --------------------------------------
		// init / boot
		// --------------------------------------

		System.out.println("=====================");

		ConfigurableApplicationContext ac = null;
		ac = new AnnotationConfigApplicationContext(BankAppConfiguration.class);

		System.out.println("=====================");

		// -------------------------------------
		// use
		// -------------------------------------

		System.out.println("=====================");

		TxrService txrService = ac.getBean(TxrService.class);
		txrService.transfer(100.00, "1", "2");
		System.out.println();
//		txrService.transfer(100.00, "2", "1");

		System.out.println("=====================");

		// -------------------------------------
		// destroy
		// -------------------------------------
		// ..

		System.out.println("=====================");
		ac.close();
		System.out.println("=====================");

	}
}
