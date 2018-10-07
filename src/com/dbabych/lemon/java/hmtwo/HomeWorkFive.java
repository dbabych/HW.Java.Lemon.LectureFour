package com.dbabych.lemon.java.hmtwo;

/* Write a program that takes two numbers as call parameters — the lengths of the legs of a right-angled triangle, 
 * and as a result prints the angles in degrees. */

public class HomeWorkFive {

	public static void main(String[] args) {
		Triangle(20, 10);
	}

	public static double Triangle(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Hypotenuse equal = " + c);
		double f = a / c;
		double n = Math.toRadians(f);
		double alfa = Math.asin(f);
		double angleAlfa = Math.toDegrees(alfa);
		System.out.println();
		System.out.println("The alpha angle is equal to  = " + angleAlfa + " degrees");
		double angleBeta = 180 - 90 - angleAlfa;
		System.out.println("The beta angle is equal to  = " + angleBeta + " degrees");
		int s = (int) (0.5 * (a * b));
		int p = (int) (a + b + c);
		int h = (int) (a * b / c);
		System.out.println();
		System.out.println("Area of ​​a triangle = " + s);
		System.out.println("Perimeter of a triangle = " + p);
		System.out.println("The height of the triangle  = " + h);
		return 0;

	}

}
