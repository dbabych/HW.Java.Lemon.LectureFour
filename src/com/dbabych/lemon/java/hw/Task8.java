package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*�������� ���������, ������� ����� ������� ���������� �����, ����� � ������ � n-���e ���������� �����.*/

public class Task8 {
	public static void main(String[] args) {
		System.out.print("������� ���-�� ����:  ");
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		long hours = day * 24;
		long minutes = hours * 60;
		long seconds = minutes * 60;
		System.out.println("� ������ ���-�� ���� : " + hours + " ����� " + minutes + " ����� " + seconds + " ������� ");
		scan.close();
	}
}
