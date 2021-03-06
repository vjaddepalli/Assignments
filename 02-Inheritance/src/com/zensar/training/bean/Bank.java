package com.zensar.training.bean;

public class Bank {
	
	private double cash;

	public Bank() {
		super();
	}

	public Bank(int cash) {
		super();
		this.cash = cash;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public double getTotalCash() {
		
		SavingAccount savAcc=new SavingAccount();
		CurrentAccount curAcc=new CurrentAccount();
		
		return savAcc.computeTotalCash(this.cash)+curAcc.computeTotalCash(this.cash);
	}
	
	

}
