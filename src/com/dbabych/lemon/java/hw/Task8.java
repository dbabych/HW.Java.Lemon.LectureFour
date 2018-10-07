package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* Write a program that will count the number of hours, 
 * minutes and seconds in the n-number of days */

public class Task8 {
	public static void main(String[] args) {
		System.out.print("Enter the number of days:  ");
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		long hours = day * 24;
		long minutes = hours * 60;
		long seconds = minutes * 60;
		System.out.println(
				"In this number of days : " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds. ");
		scan.close();
	}
}
