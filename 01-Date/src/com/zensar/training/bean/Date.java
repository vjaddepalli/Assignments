package com.zensar.training.bean;

public class Date {

	private String day;
	private String month;
	private String year;

	public Date() {
		super();
	}

	public Date(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String printDate() {
		String date = this.day + "/" + this.month + "/" + this.year;
		return date;
	}

	public String swapTwoDates(String date1, String date2) {
		String temp;
		temp = date1;
		date1 = date2;
		date2 = temp;
		return  "Date1 :"+date1+" and Date2 :"+date2;

	}

}
