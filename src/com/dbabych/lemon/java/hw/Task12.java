package com.dbabych.lemon.java.hw;

/*В переменной n хранится натуральное двузначное число. Создайте программу,
 * вычисляющую и выводящую на экран сумму цифр числа n.*/

public class Task12 {

	public static void main(String[] args) {
		int n = 33;
		int j = n / 10;
		int f = n % 10;
		System.out.println("Сумма цифр переменной n  = " + (j + f));
	}
}
