package com.dbabych.lemon.java.hmtwo;

/* Write an infinite loop for (for), (while), (do while) */

public class HomeWorkFour {

	public static void main(String[] args) {
		HomeWorkFour b = new HomeWorkFour();
		CycleWhile();
		CyclewFor();
		CycleWhile();

	}
	//Infinite cycle while
	public static void CycleWhile() {

		boolean b = true;
		while (b) {
			System.out.println("3");
		}
	}
	//Infinite cycle for
	public static void CyclewFor() {
		int i = 0;
		for (;;) {
			i++;
			System.out.println(i);
		}
	}
	//Infinite cycle do/while
	public static void CyclewDoWhile() {
		int i = 0;
		do {
			i++;
			System.out.println(i);
		} while (true);
	}
}
