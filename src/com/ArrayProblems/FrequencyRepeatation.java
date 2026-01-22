package com.ArrayProblems;

import java.util.Scanner;

public class FrequencyRepeatation {
	/**
	 * 1: Accept user input
	 * 2: create visited to store visited elements
	 * 3: create for loop to traverse all elements
	 * 4: set arr[i] as key
	 * 5: if arr[i] is not visited continue
	 * 6: else 
	 * 7: set count = 1, key == arr[i]
	 * 8: start a loop to compare key from j= i+1
	 * 9: if arr[j] == key
	 * 10: update visted[i] as true and count++
	 * 11: end of for
	 * 12: print key and count
	 * 13: end of for
	 * 14: stop
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		
		int []arr = new int[sc.nextInt()];
		System.out.println("Enter number of digits");
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = sc.nextInt();
		}
		freqCount(arr);
	}
	
	public static void freqCount(int []arr) {
		
		boolean visited[] = new boolean[arr.length];
		int count, key;
		for(int i = 0; i <= arr.length-1; i++) {
			if(visited[i] == true) continue;
			else {
				
				 count =1;
				key = arr[i];
			}
			for(int j = i+1; j <= arr.length-1; j++) {
				
				if(arr[j] == key) {
					visited[i] = true;
					count++;
				}
			}
			System.out.println(key +": " + count);
		}
	}

}
