package com.dbabych.lemon.java.hw;

/* Make a program that will check whether a double is integer. */

public class Task1 {

	public static void main(String[] args) {
		double d = 3.25;
		System.out.println(d + (d % 1 == 0 ? " - integer " : " not integer "));
	}
}
