package com.dbabych.lemon.java.hw;

/* В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на
 * экран результат деления q на w с остатком. Пример вывода программы (для случая, когда
 * в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке. */

public class Task11 {

	public static void main(String[] args) {
		int numberOne = 22, numberTwo = 9;
		int i = numberOne / numberTwo;
		int j = numberOne - (i * numberTwo);
		System.out.println("21 / 8 = " + i + " и " + j + " в остатке");
	}
}
