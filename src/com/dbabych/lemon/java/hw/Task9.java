package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника. */

public class Task9 {

	public static void main(String[] args) {
		System.out.print("Введите первый катет:  ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.print("Введите второй катет:  ");
		int b = scan.nextInt();
		int s = (int) (0.5 * a * b); // Находим площадь прям. треугольника ;
		int c = (int) Math.sqrt((a * a) + (b * b)); // Находим гипотенузу;
		int p = a + b + c; // Находим периметр;
		System.out.println( " Гипотенуза прямоугольного теругольника  = " + c + "\n Его периметр =  " + p + "\n Его площадь " + s);
		scan.close();
	}

}