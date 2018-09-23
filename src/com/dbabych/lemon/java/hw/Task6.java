package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.*/

public class Task6 {

	public static void main(String[] args) {
		System.out.print("Введите число:  ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int i = 1;
		int sum;
		while (i <= 10) {
			sum = number * i;
			System.out.println(number + " * " + i + " = " + sum);
			i++;
			scan.close();
		}
	}
}