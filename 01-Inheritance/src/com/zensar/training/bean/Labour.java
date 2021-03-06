package com.zensar.training.bean;

public class Labour extends Employee {

	private double overtimeHrs;

	public Labour() {
		super();
	}

	public Labour(double salary, double overtimeHrs) {
		super(salary);
		this.overtimeHrs = overtimeHrs;
	}

	public double getOvertimeHrs() {
		return overtimeHrs;
	}

	public void setOvertimeHrs(double overtimeHrs) {
		this.overtimeHrs = overtimeHrs;
	}

	@Override
	public String toString() {
		return "Labour [overtimeHrs=" + overtimeHrs + "]";
	}

	@Override
	public double computeTotalSalary() {
		return this.getSalary() + (100 * overtimeHrs);
	}

}
