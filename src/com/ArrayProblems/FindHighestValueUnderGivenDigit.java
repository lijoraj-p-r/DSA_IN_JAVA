package com.ArrayProblems;


import java.util.Arrays;

public class FindHighestValueUnderGivenDigit {

	/*
	 * 1: Take user input
	 * 2: from 0 to last of array
	 * 3: initilaze  res = 
	 * 3: check for arr[i] <= high && arr[i] > res
	 */
	public static void main(String[] args) {
		double[] arr = {150.5, 200.0, 300.0, 400.25};
        findHighest(arr, 100.0);
	}
	
	public static void findHighest(double[] arr, double high) {
		 double res = -1;
		Arrays.sort(arr);
		for(int i = 0; i <= arr.length-1; i++) {
			if (arr[i] <= high && arr[i] > res) {
	            res = arr[i];
	        }
		}
		if(res!=-1) {
			System.out.println(res);
		} else {
			System.out.println("Highest Not found");
		}
	}

}
