package com.dbabych.lemon.java.hw;

/*Напишите метод переводящий гривны в доллары по заданному курсу. 
 * В качестве аргументов передайте кол-во гривен и курс.*/

public class Task16 {

	static float exchanger(int grn, int course) {
		float exchange = grn / course;
		return exchange;
	}

	public static void main(String[] args) {
		exchanger(1500, 28);
		System.out.println(exchanger(1500, 28));
	}
}
