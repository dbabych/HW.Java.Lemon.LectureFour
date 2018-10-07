package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* Given the temperature in degrees Celsius. Show temperature in degrees Fahrenheit */

public class Task2 {

	public static void main(String[] args) {
		System.out.print("Enter degrees Celsius ");
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int tf = tc * 9 / 5 + 32;
		System.out.println(tc + " degrees Celsius " + " = " + tf + " by Fahrenheit");
		scan.close();
	}
}
