package com.zensar.training.ui;

import com.zensar.training.bean.Bank;

public class Main {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setCash(1500.00);
		
		System.out.println(b.getTotalCash());

	}

}
