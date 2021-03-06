package com.zensar.training.bean;

public class CurrentAccount implements Account {

	private double cashCredit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(double cashCredit) {
		super();
		this.cashCredit = cashCredit;
	}

	public double getCashCredit() {
		return cashCredit;
	}

	public void setCashCredit(double cashCredit) {
		this.cashCredit = cashCredit;
	}

	@Override
	public double computeTotalCash(double cash) {
		this.cashCredit=cash;
		return this.cashCredit;
	}

}
