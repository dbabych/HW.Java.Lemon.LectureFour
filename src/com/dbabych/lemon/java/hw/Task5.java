package com.dbabych.lemon.java.hw;

/*Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.(*)*/

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.print("Введите Ваше имя:  ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Ваше имя: " + name);
		scan.close();
	}
}
