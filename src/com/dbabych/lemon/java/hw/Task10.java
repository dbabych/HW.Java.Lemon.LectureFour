package com.dbabych.lemon.java.hw;

/* Алгоритм нахождения НОД вычитанием.
 * Из большего числа вычитаем меньшее.
 * Если получается 0, то значит, что числа равны друг другу и являются НОД.
 * Если результат вычитания не равен 0, то большее число заменяем на результат вычитания */

public class Task10 {

	public static void main(String[] args) {
		int a = 33, b = 12;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println(a);
	}
}