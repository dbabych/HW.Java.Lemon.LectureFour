package com.dbabych.lemon.java.hw;

/* �������� ���������� ��� ����������.
 * �� �������� ����� �������� �������.
 * ���� ���������� 0, �� ������, ��� ����� ����� ���� ����� � �������� ���.
 * ���� ��������� ��������� �� ����� 0, �� ������� ����� �������� �� ��������� ��������� */

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