package com.ArrayProblems;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int [] arr = { 86, 42, 23, 18, 25};
		Arrays.sort(arr);
		BinarySearch(arr, 18);
	}
	
	public static void BinarySearch(int []arr, int target) {
		int left = 0, right = arr.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == target) {
				System.out.println("Found at " + mid);
				return;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid+1;
			}
		}
		
	}

}
