package com.dbabych.lemon.java.hw;

/*�������� ���������, ������� ����� ������� ������ ���� ���, � ����� ������� ��� �� �������.(*)*/

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.print("������� ���� ���:  ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("���� ���: " + name);
		scan.close();
	}
}
