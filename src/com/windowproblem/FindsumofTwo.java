package com.windowproblem;

public class FindsumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		findSUmofTwo(arr);	
	}
	
	public static void findSUmofTwo(int[] arr) {
		
		for( int i = 0; i <= arr.length-1; i += 2) {
			
			if( i < arr.length-1) {
				int j = i+1;
			System.out.print(arr[i] + arr[j] + " ");
			}
		}
	}

}
