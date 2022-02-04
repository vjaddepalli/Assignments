package com.zensar.training.ui;

import com.zensar.training.bean.ComplexNumbers;

public class Main {

	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers();
		c1.setReal(4);
		c1.setImag(2);
		System.out.println("C1="+c1.getReal()+"+i"+c1.getImag());
		ComplexNumbers c2 = new ComplexNumbers();
		c2.setReal(3);
		c2.setImag(1);
		System.out.println("C2="+c2.getReal()+"+i"+c2.getImag());
		
		ComplexNumbers c3 = new ComplexNumbers();
		System.out.println(c3.add(c1, c2));
		System.out.println(c3.sub(c1, c2));
		System.out.println(c3.mul(c1, c2));
		System.out.println("After Swap: "+c3.swap(c1, c2));

	}

}
