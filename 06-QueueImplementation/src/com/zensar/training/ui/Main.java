package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue arr=new Queue(10);
		arr.push(12);
		arr.push(10);
		arr.push(11);
		arr.push(21);
		arr.push(22);
		arr.push(35);
		arr.push(46);
		arr.push(85);
		arr.push(75);
		arr.push(98);
		
		System.out.println(arr.toString());
		
		System.out.println(arr.pop());
		System.out.println(arr.pop());
		System.out.println(arr.pop());

	}

}
