package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* Develop a program that will display the multiplication table of the number 
 * entered by the user from the keyboard */

public class Task6 {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int i = 1;
		int sum;
		while (i <= 10) {
			sum = number * i;
			System.out.println(number + " * " + i + " = " + sum);
			i++;
			scan.close();
		}
	}
}