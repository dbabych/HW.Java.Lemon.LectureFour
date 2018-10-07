package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* Given the legs of a right triangle. 
 * Find the area, perimeter and hypotenuse of the triangle */

public class Task9 {

	public static void main(String[] args) {
		System.out.print("Enter the first leg:  ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.print("Enter the second leg:  ");
		int b = scan.nextInt();
		int s = (int) (0.5 * a * b);
		int c = (int) Math.sqrt((a * a) + (b * b));
		int p = a + b + c;
		System.out.println("Hypotenuse = " + c + "\n" + "Perimeter =  " + p + "\n" + "Area = " + s);
		scan.close();
	}

}