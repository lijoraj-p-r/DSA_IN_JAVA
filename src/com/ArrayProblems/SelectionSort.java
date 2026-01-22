package com.ArrayProblems;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		/**
		 * 1: start
		 * 2: initialse min and pos for holding positon
		 * 3: start from i = 0 till arr.length-2 (assume first is min)
		 * 4: update min = arr[i], pos = i;
		 * 5: start from j = i+1 till end of arr
		 * 6: if(arr[j] < min) 
		 * 7: update min = arr[j]
		 * 8: pos = j;
		 * 9: end if
		 * 10: end j loop
		 * 11: swap arr[i] and arr[pos]
		 * 12: end of i loop
		 * 13: stop
		 */
		int []arr = {1, 2, 3, 4, 7, 0};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void  selectionSort(int []arr) {
		int min = 0;
		int pos = 0;
		
		for(int i = 0; i <= arr.length-2; i++) {
			min = arr[i];
			pos = i;
			
			for(int j = i+1; j <= arr.length-1; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}

}
