package com.dbabych.lemon.java.hw;

/* The variable n stores a natural two-digit number. 
 * Create a program that calculates and displays the sum of digits of the number n */

public class Task12 {

	public static void main(String[] args) {
		int n = 33;
		int j = n / 10;
		int f = n % 10;
		System.out.println("Sum of variable digits n  = " + (j + f));
	}
}
