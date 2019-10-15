package com.exercise9bubblesort.app;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		final int ELEMENTS_ARRAY = 10;
		int tmp = 0;
		int[] unorderedArray = new int[ELEMENTS_ARRAY];
		int[] orderedArray = new int[ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			unorderedArray[i] = randomNumbers.nextInt(101);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.print(unorderedArray[i] + " ");
		}
		
		System.out.println(" ");
		
		//method bubble
		for(int i = 0; i<ELEMENTS_ARRAY; i++) {
			for(int j=0; j<ELEMENTS_ARRAY-1; j++) {
				if(unorderedArray[j] < unorderedArray[j+1]) {
					tmp = unorderedArray[j+1];
					unorderedArray[j+1] = unorderedArray[j];
					unorderedArray[j]=tmp;
				}
			}
		}
		
		//displaying ordered array with Bubble sort Desc
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.print(unorderedArray[i] + " ");
		}
		
	}

}
