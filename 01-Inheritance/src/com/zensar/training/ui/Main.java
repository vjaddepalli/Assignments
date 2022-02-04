package com.zensar.training.ui;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Labour;
import com.zensar.training.bean.Manager;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setSalary(15000.00);
		System.out.println("Employee Total Salary: "+e1.computeTotalSalary());
		
		Manager m = new Manager();
		m.setSalary(20000.00);
		m.setIncentive(1000.00);
		System.out.println("Manager Total Salary: "+m.computeTotalSalary());
		
		Labour l=new Labour();
		l.setSalary(1500);
		l.setOvertimeHrs(2);
		System.out.println("Labour Total Salary: "+l.computeTotalSalary());

	}

}
