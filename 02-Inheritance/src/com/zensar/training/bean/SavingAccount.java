package com.zensar.training.bean;

public class SavingAccount implements Account {

	private double fixedDeposits;

	public SavingAccount() {
		super();
	}

	public SavingAccount(double fixedDeposits) {
		super();
		this.fixedDeposits = fixedDeposits;
	}

	public double getFixedDeposits() {
		return fixedDeposits;
	}

	public void setFixedDeposits(double fixedDeposits) {
		this.fixedDeposits = fixedDeposits;
	}

	@Override
	public double computeTotalCash(double cash) {
		this.fixedDeposits=cash;
		return this.fixedDeposits;
	}

}
