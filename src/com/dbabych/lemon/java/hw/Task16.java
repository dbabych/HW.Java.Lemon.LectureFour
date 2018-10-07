package com.dbabych.lemon.java.hw;

/* Write a method that translates the grn into dollars at a given rate.
 * As an argument, pass the number of grn and the course.*/

public class Task16 {

	static float exchanger(int grn, int course) {
		float exchange = grn / course;
		return exchange;
	}

	public static void main(String[] args) {
		exchanger(1500, 28);
		System.out.println(exchanger(1500, 28));
	}
}
