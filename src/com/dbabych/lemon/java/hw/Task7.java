package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* User enters sets distance to destination (N) and the time it takes to get there (T). 
 * Calculate the speed (km / h) with which to go */

public class Task7 {

	public static void main(String[] args) {
		System.out.print("Enter the distance to the destination (km):  ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print("Enter the time for which you need to drive (min):  ");
		double t = scan.nextDouble();
		double time = t / 60;// Translate minutes to hours, provided that 60 min = 1.
		double speed = n / time;
		System.out.println("Required speed (km / h): " + speed);
		scan.close();
	}
}
