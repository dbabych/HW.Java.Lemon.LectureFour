package com.dbabych.lemon.java.hw;

/*—делайте программу, котора€ будет провер€ть €вл€етс€ ли число типа double целым.*/

public class Task1 {

	public static void main(String[] args) {
		double d = 3.25;
		System.out.println(d + (d % 1 == 0 ? " - целое число " : " - не целое число"));
	}
}
