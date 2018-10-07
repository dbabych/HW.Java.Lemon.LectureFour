package com.dbabych.lemon.java.hmtwo;

/* Write a method to check if the string is a palindrome.
 * Write a method to remove the specified character from the string.
 * Convert a string to an array of bytes and back. */
import java.lang.*;
import java.util.Arrays;

public class HomeWorkSeven {

	private String str1;

	public static void main(String[] args) {
		isPalindrom();
		System.out.println("~~~~~~~~~~~");
		deletePosition(null, 0);
		System.out.println("~~~~~~~~~~~");
		RowsToArray();
	}
	//method to check if the string is a palindrome.
	public static void isPalindrom() {
		String str = " мокнет оксана с котенком ";
		StringBuffer stb = new StringBuffer(str).reverse();
		String str1 = stb.toString().replaceAll("\\p{Z}", "");
		String str2 = str.replaceAll("\\p{Z}", "");
		System.out.println(str1.equals(str2));

	}
	//method to remove the specified character from the string.
	public static void deletePosition(String str, int i) {
		str = "абвгд";
		System.out.println(removeCharAt(str, 2));
	}

	public static String removeCharAt(String str, int i) {
		return str.substring(0, i) + str.substring(i + 1);

	}
	//Convert a string to an array of bytes and back.
	public static void RowsToArray() {
		String str = "LemonSchool";
		byte[] arr = str.getBytes();
		System.out.println("Строка в массив  :" + Arrays.toString(arr));
		String str1 = new String(arr);
		System.out.println("Массив в строку :" + str1);

	}

}
