package com.dbabych.lemon.java.hw;

/* � ���������� q � w �������� ��� ����������� �����. �������� ���������, ��������� ��
 * ����� ��������� ������� q �� w � ��������. ������ ������ ��������� (��� ������, �����
 * � q �������� 21, � � w �������� 8): 21 / 8 = 2 � 5 � �������. */

public class Task11 {

	public static void main(String[] args) {
		int numberOne = 22, numberTwo = 9;
		int i = numberOne / numberTwo;
		int j = numberOne - (i * numberTwo);
		System.out.println("21 / 8 = " + i + " � " + j + " � �������");
	}
}
