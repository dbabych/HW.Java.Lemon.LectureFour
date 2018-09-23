package com.dbabych.lemon.java.hw;

/*В переменной n хранится натуральное трёхзначное число. 
 * Создайте программу,вычисляющую и выводящую на экран сумму цифр числа n.*/

public class Task14 {

	public static void main(String[] args) {
		int i = 457;
		int j = i / 100;
		int h = i % 100;
		int t = h / 10;
		int v = h % 10;
		System.out.println("Сумма цифр числа n " + (j + t + v));

	}

}
