package com.dbabych.lemon.java.hw;

import java.util.Scanner;

/*������������ ������ ������ ���������� �� ����� ���������� (N) 
 * � �����, �� ������� ����� ������� (T). 
 * ��������� �������� (��/�), � ������� ����� �����.*/

public class Task7 {

	public static void main(String[] args) {
		System.out.print("������� ���������� �� ����� ���������� (��):  ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print("������� �����, �� ������� ����� ������� (���):  ");
		double t = scan.nextDouble();
		double time = t / 60;// ��������� ������ � ����, ��� �������, ��� 60 ��� = 1.
		double speed = n / time;
		System.out.println("����������� �������� (��/�): " + speed);
		scan.close();
	}
}
