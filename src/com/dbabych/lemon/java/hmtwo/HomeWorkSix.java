package com.dbabych.lemon.java.hmtwo;

/*  Understand one of the array sorting methods and write the implementation. 
 * Sort by bubble, selection, insert. */

import java.util.Arrays;

public class HomeWorkSix {

	public static void main(String[] args) {
		int[] arr = { 11, 3, 14, 16, 7, 9, 100, 56, 30 };
		boolean bool = false;
		int m;
		while (!bool) {
			bool = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					bool = false;
					m = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = m;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
