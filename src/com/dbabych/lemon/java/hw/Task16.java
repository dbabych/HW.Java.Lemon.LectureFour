package com.dbabych.lemon.java.hw;

/*�������� ����� ����������� ������ � ������� �� ��������� �����. 
 * � �������� ���������� ��������� ���-�� ������ � ����.*/

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
