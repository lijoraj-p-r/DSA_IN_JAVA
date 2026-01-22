package com.ArrayProblems;

import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before Sort: " + Arrays.toString(arr)); 
		insertionSort(arr);
		System.out.println("After Sort: " + Arrays.toString(arr));
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i <= arr.length-1; i++) {
			int item = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
	}

}
