package com.dbabych.lemon.java.hmtwo;

/* 1. The distance between two points.
 * 2. The distance from this point to another point.
 * 3. The distance from this point to the origin.
 * 4. Shift point along the X axis by a specified amount.
 * 5. Shift point along the Y axis by a specified amount. */

import java.util.Scanner;

public class HomeWorkTwo {

	private double x1 = 9, y1 = 3, x2 = 8, y2 = 5;

	public static void main(String[] args) {

		HomeWorkTwo b = new HomeWorkTwo();
		System.out.println("–ассто€ние между двум€ точками с координатами (9,8) (3,5)");
		b.HomeWorkTwo();
		System.out.println("–ассто€ние между заданной точкой с координатами (9,8) , и точкой, "
				+ "которую пользователь вводит с консоли)");
		b.ScannerDistance();
		System.out.println("–ассто€ние от заданной точки до начала координат ");
		b.DistatnceToStart();
		System.out.println("—двиг точки по оси ’ при заданом значении по умолчанию x1 = 9 ");
		b.ShiftX();
		System.out.println("—двиг точки по оси Y при заданом значении по умолчанию y1 = 8 ");
		b.ShiftY();

	}
	// The distance between two points.
	public double HomeWorkTwo() { 
		double numberOne = x2 - x1;
		double numberTwo = y2 - y1;
		double powOne = Math.pow(numberOne, 2);
		double powTwo = Math.pow(numberTwo, 2);
		double distance = Math.sqrt(powOne + powTwo);
		System.out.println(distance + "\n");
		return distance;
	}
	//The distance from this point to another point.
	public double ScannerDistance() {
		Scanner scan = new Scanner(System.in);
		System.out.print("¬ведите координаты дл€ второй точки по оси X " + "\t");
		double x2 = scan.nextDouble();
		System.out.print("¬ведите координаты дл€ второй точки по оси Y " + "\t");
		double y2 = scan.nextDouble();
		double numberOne = x2 - x1;
		double numberTwo = y2 - y1;
		double powOne = Math.pow(numberOne, 2);
		double powTwo = Math.pow(numberTwo, 2);
		double distance = Math.sqrt(powOne + powTwo);
		System.out.println(distance + "\n");
		return distance;

	}
	//The distance from this point to the origin.
	public double DistatnceToStart() {
		double distance = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		System.out.println(distance + "\n");
		return 0;
	}
	//Shift point along the X axis by a specified amount.
	public int ShiftX() {
		Scanner scanOne = new Scanner(System.in);
		System.out.print("¬ведите число, на которое необходимо увеличить x1 ");
		int k = scanOne.nextInt();
		int sum = (int) (x1 + k);
		System.out.println("x1 = " + sum + "\n");
		return 0;
	}
	//Shift point along the Y axis by a specified amount.
	public int ShiftY() {
		Scanner scanOne = new Scanner(System.in);
		System.out.print("¬ведите число, на которое необходимо увеличить y1 ");
		int k = scanOne.nextInt();
		int sum = (int) (y1 + k);
		System.out.println("y1 = " + sum);
		scanOne.close();
		return 0;

	}
}