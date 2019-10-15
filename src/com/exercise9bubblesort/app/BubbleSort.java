package com.exercise9bubblesort.app;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		final int ELEMENTS_ARRAY = 100;
		int tmp = 0;
		int[] unorderedArray = new int[ELEMENTS_ARRAY];
		int[] orderedArray = new int[ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			unorderedArray[i] = randomNumbers.nextInt(101);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(unorderedArray[i] + "");
		}
		
		//method bubble

	}

}
