package com.dbabych.lemon.java.hw;

/* The variables q and w store two natural numbers. 
 * Create a program that displays the result of dividing q by w with the remainder. 
 * An example of the output of the program 
 * (for the case when 21 is stored in q, and 8 is stored in w): 21/8 = 2 and 5 in the remainder.*/

public class Task11 {

	public static void main(String[] args) {
		int numberOne = 22, numberTwo = 9;
		int i = numberOne / numberTwo;
		int j = numberOne - (i * numberTwo);
		System.out.println("21 / 8 = " + i + " and " + j + " in the balance");
	}
}
