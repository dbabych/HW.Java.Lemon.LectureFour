package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* Дано значение температуры в градусах Цельсия. Вывести температуру в градусах
Фаренгейта */

public class Task2 {

	public static void main(String[] args) {
		System.out.print("Введите градусы С ");
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int tf = tc * 9 / 5 + 32;
		System.out.println(tc + " градусов Цельсия " + " = " + tf + " по Фаренгейту");
		scan.close();
	}
}
