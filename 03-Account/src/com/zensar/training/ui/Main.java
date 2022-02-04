package com.zensar.training.ui;

import com.zensar.training.bean.Account;

public class Main {

	public static void main(String[] args) {
		Account a =new Account();
		a.deposit();
		a.withdraw();
		a.printBalance();

	}

}
