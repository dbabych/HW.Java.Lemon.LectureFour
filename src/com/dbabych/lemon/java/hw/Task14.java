package com.dbabych.lemon.java.hw;

/*� ���������� n �������� ����������� ���������� �����. 
 * �������� ���������,����������� � ��������� �� ����� ����� ���� ����� n.*/

public class Task14 {

	public static void main(String[] args) {
		int i = 457;
		int j = i / 100;
		int h = i % 100;
		int t = h / 10;
		int v = h % 10;
		System.out.println("����� ���� ����� n " + (j + t + v));

	}

}
