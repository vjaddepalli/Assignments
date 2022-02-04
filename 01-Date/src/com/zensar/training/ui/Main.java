package com.zensar.training.ui;

import com.zensar.training.bean.Date;

public class Main {

	public static void main(String[] args) {
		Date date=new Date();
		date.setDay("23");
		date.setMonth("01");
		date.setYear("2022");
		System.out.println("Date 1: "+date.printDate());
		
		Date date2=new Date();
		date2.setDay("24");
		date2.setMonth("01");
		date2.setYear("2022");
		System.out.println("Date 2: "+date.printDate());
		
		System.out.println("After Swap: \n"+date.swapTwoDates(date.printDate(), date2.printDate()));


	}

}
