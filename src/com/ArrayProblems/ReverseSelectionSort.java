package com.ArrayProblems;

import java.util.Scanner;
import java.util.Arrays;


public class ReverseSelectionSort {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        String str = scan.nextLine().trim();
	        str=str.replaceAll("[\\[\\],]", "");
	        String numbers[]=str.split(" ");
	        int arr[]=new int[numbers.length];
	        for(int i=0;i<=numbers.length-1;i++) {
	            arr[i]=Integer.parseInt(numbers[i]);
	        }
	        insertSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	    
	    public static void insertSort(int arr[]) {
	        for(int i=1;i<=arr.length-1;i++) {
	            int item=arr[i];
	            int j=i-1;
	            while(j>=0 && arr[j]<item) {
	                arr[j+1]=arr[j];
	                j--;
	            }
	            arr[j+1]=item;
	        }
	    }
}
