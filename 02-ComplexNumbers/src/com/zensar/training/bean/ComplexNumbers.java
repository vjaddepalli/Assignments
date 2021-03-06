package com.zensar.training.bean;

public class ComplexNumbers {

	private int real;
	private int imag;

	public ComplexNumbers() {
		super();
	}

	public ComplexNumbers(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	// Addition
	public String add(ComplexNumbers c1, ComplexNumbers c2) {
		String str;
		ComplexNumbers cn = new ComplexNumbers();
		cn.real = c1.real + c2.real;
		cn.imag = c1.imag + c2.imag;
		str = cn.real + "+i" + cn.imag;
		return str;

	}

	// Subtraction
	public String sub(ComplexNumbers c1, ComplexNumbers c2) {
		String str;
		ComplexNumbers cn = new ComplexNumbers();
		cn.real = c1.real - c2.real;
		cn.imag = c1.imag - c2.imag;
		str = cn.real + "+i" + cn.imag;
		return str;
	}

	// Multiplication
	public String mul(ComplexNumbers c1, ComplexNumbers c2) {
		String str;
		ComplexNumbers cn = new ComplexNumbers();
		cn.real = c1.real * c2.real;
		cn.imag = c1.imag * c2.imag;
		str = cn.real + "+i" + cn.imag;
		return str;
	}

	// Swap
	public String swap(ComplexNumbers c1, ComplexNumbers c2) {
		String str;
		ComplexNumbers cn = new ComplexNumbers();
		cn = c1;
		c1 = c2;
		c2 = cn;
		str = "C1=" + c1.real + "+i" + c1.imag + " and  C2=" + c2.real + "+i" + c2.imag;
		return str;
	}

}
