package com.dbabych.lemon.java.hw;

/* Write a method that will increase the given array element by 10%. */

public class Task17 {

	public static void main(String[] args) {
		increasingArray();
		System.out.println(increasingArray());

	}

	static double increasingArray() {
		double[] myArray = { 1, 50, 30 };
		double element = myArray[1] + myArray[1] / 100 * 10;
		return element;
	}
}
