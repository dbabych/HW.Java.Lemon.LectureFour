package com.dbabych.lemon.java.hw;

/*The variable n stores a natural three-digit number.
 * Create a program that calculates and displays the sum of digits of the number n*/

public class Task14 {

	public static void main(String[] args) {
		int i = 457;
		int j = i / 100;
		int h = i % 100;
		int t = h / 10;
		int v = h % 10;
		System.out.println("Sum of digits n " + (j + t + v));

	}

}
