package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/* ���� �������� ����������� � �������� �������. ������� ����������� � ��������
���������� */

public class Task2 {

	public static void main(String[] args) {
		System.out.print("������� ������� � ");
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		int tf = tc * 9 / 5 + 32;
		System.out.println(tc + " �������� ������� " + " = " + tf + " �� ����������");
		scan.close();
	}
}
