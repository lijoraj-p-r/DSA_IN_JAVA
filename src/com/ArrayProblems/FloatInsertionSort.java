package com.ArrayProblems;

import java.util.Scanner;

public class FloatInsertionSort {
	    public static void main(String[] args) {
	        
	           Scanner sc = new Scanner(System.in);
	            
	            // Number of employees
	            int n = sc.nextInt();
	            
	            // Array to store salaries
	            float[] salaries = new float[n];
	            for (int i = 0; i < n; i++) {
	                salaries[i] = sc.nextFloat();
	            }
	            
	            // Write your code here to sort the salaries using Insertion Sort
	            
	            insertSort(salaries);
	            
	            System.out.print("Sorted Salaries: ");
	            for(int i=0;i<=salaries.length-1;i++) {
	                System.out.printf("%.2f ",salaries[i]);
	            }
	        }
	    
	    public static void insertSort(float arr[]) {
	        for(int i=1;i<=arr.length-1;i++) {
	            float item=arr[i];
	            int j=i-1;
	            while(j>=0 && arr[j]<item) {
	                arr[j+1]=arr[j];
	                j--;
	            }
	            arr[j+1]=item;
	        }
	    }
	}


