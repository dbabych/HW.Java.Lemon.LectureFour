package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*���� ������ �������������� ������������. ������� �������, �������� � ���������� ������������. */

public class Task9 {

	public static void main(String[] args) {
		System.out.print("������� ������ �����:  ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.print("������� ������ �����:  ");
		int b = scan.nextInt();
		int s = (int) (0.5 * a * b); // ������� ������� ����. ������������ ;
		int c = (int) Math.sqrt((a * a) + (b * b)); // ������� ����������;
		int p = a + b + c; // ������� ��������;
		System.out.println( " ���������� �������������� ������������  = " + c + "\n ��� �������� =  " + p + "\n ��� ������� " + s);
		scan.close();
	}

}