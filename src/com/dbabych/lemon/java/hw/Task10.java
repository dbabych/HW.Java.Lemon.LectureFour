package com.dbabych.lemon.java.hw;

/* Algorithm for finding NOD by subtraction.
 * From the larger number subtract the smaller.
 * If it turns out 0, it means that the numbers are equal to each other and are NOD.
 * If the result of the subtraction is not 0, then a larger number is replaced by the result of the subtraction */

public class Task10 {

	public static void main(String[] args) {
		int a = 33, b = 12;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println(a);
	}
}