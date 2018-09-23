package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*Напишите программу, которая будет считать количество часов, минут и секунд в n-номe количестве суток.*/

public class Task8 {
	public static void main(String[] args) {
		System.out.print("Введите кол-во дней:  ");
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		long hours = day * 24;
		long minutes = hours * 60;
		long seconds = minutes * 60;
		System.out.println("В данном кол-ве дней : " + hours + " Часов " + minutes + " Минут " + seconds + " Секкунд ");
		scan.close();
	}
}
