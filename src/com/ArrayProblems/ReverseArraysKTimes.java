package com.ArrayProblems;

import java.util.Arrays;


public class ReverseArraysKTimes {

	/*
	 * 1: start
	 * 2: Call a method to rotate and pass array and k
	 * 3: Inside method rotate
	 * 4: Call Reverse Sub Array and pass arr, 0 , arr.length-1
	 *    Fully rotate once
	 * 5: Rotate till first half 0 to k-1
	 * 6: Rotate second half from k to arr.length-1
	 * 7: Stop
	 */
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k =10;
		rotate(arr, k);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void ReverseSubArray(int arr[], int start, int end) {
		while(start <end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void rotate(int arr[], int k) {
		if(k > arr.length) {
			k = k%arr.length;
		}
		
		//Fully rotate once
		ReverseSubArray(arr, 0, arr.length-1);
		
		//Rotate first Half till k
		ReverseSubArray(arr, 0, k-1);
		
		//Rotate second half from k to end
		ReverseSubArray(arr, k, arr.length-1);
	}
}
