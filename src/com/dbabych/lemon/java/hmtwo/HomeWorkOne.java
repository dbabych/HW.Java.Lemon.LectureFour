
package com.dbabych.lemon.java.hmtwo;

/*Write a program that calculates and prints sine and cosine 30.
 * Now we transform our program so that it can calculate the sine 
 * and cosine of an arbitrary argument in degrees.
 * A program must accept one call parameter (args [0]), convert it to the desired number of radians, 
 * calculate sine and cosine, and print the argument and the value of sine and cosine. */

import java.lang.*;

public class HomeWorkOne {
	static double valueOne;
	static double valueTwo;
	static double valueThree;

	public static void main(String[] args) {
		SinCos();
		System.out.println("\n");
		parseDouble();

	}
	//We find sin and cos...
	public static void SinCos() {
		valueOne = Math.toRadians(30);
		valueTwo = Math.toRadians(30);
		double sin = Math.sin(valueOne);
		double cos = Math.cos(valueTwo);
		System.out.println("~~~~ Find the sin and cos 30 degrees ~~~~" + "\n");
		System.out.println("Sin of 30 degrees   = " + sin);
		System.out.println("Cos of 30 degrees = " + cos);

	}
	//We find sin and cos using the method (parseDouble())
	public static void parseDouble() {
		String args = "60";
		double value = Double.parseDouble(args);
		valueThree = Math.toRadians(value);
		double ValueSin = Math.sin(valueThree);
		double ValueCos = Math.cos(valueThree);
		System.out.println("~~~~ Work with method parseDouble ~~~~" + "\n");
		System.out.println("The specified argument " + value + " , his sin  = " + ValueSin);
		System.out.println("The specified argument " + value + " , his cos  = " + ValueCos);
	}
}
