package com.dbabych.lemon.java.hw;

/* Write a program that will ask you to enter your name
 *  and then bring it to the console */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.print("Enter your name:  ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Your name is: " + name);
		scan.close();
	}
}
