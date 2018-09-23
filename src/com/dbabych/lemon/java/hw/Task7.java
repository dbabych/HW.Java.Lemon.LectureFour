package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*Пользователь вводит задает расстояние до места назначения (N) 
 * и время, за которое нужно доехать (T). 
 * Вычислить скорость (км/ч), с которой нужно ехать.*/

public class Task7 {

	public static void main(String[] args) {
		System.out.print("Введите расстояние до места назначения (км):  ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print("Введите время, за которое нужно доехать (мин):  ");
		double t = scan.nextDouble();
		double time = t / 60;// переводим минуты в часы, при условии, что 60 мин = 1.
		double speed = n / time;
		System.out.println("Необходимая скорсоть (км/ч): " + speed);
		scan.close();
	}
}
