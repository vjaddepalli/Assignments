package com.zensar.training.bean;

import java.util.Arrays;

public class Queue {

	private int arr[];
	private int front, rear;

	public Queue(int size) {
		front = -1;
		rear = -1;
		this.arr = new int[size];
	}

	public void push(int element) {

		if (front == -1)
			front = 0;
		rear++;
		arr[rear] = element;

	}

	public int pop() {
		int element;
		element = arr[front];
		if (front >= rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
		return element;
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = front; i <= rear; i++)
			str = str + this.arr[i] + " ,";
		str = str + "]";

		return str;
	}

}
