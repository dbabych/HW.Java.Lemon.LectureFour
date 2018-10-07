package com.dbabych.lemon.java.hmtwo;

/* Modify SymbolTest.java so that the number of generated symbols is specified by the user. */

import java.util.Scanner;

public class HomeWorkTree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of characters displayed ");
		int number = scan.nextInt();
		System.out.print("Enter the number of characters to be generated. ");
		int numberOne = scan.nextInt();
		for (int i = 0; i < number; i++) {
			char c = (char) (Math.random() * numberOne + 'a');
			System.out.print(c + ": ");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("sometimes vowel");
				break;
			default:
				System.out.println("consonant");
			}
		}

	}

}
