package com.ArrayProblems;

public class BinarySearch {
	/**
	 * Performs a binary search on a sorted array to find a specified key.
	 * Steps:
	 * 1. Divide the search space into two halves by finding the middle index "mid".
	 * 2. Compare the middle element of the search space with the key.
	 *    - If the key is found at the middle element, the process is terminated.
	 * 3. If the key is not found at the middle element:
	 *    - If the key is smaller than the middle element, then the left side is used for the next search.
	 *    - If the key is larger than the middle element, then the right side is used for the next search.
	 * 4. This process is continued until the key is found or the total search space is exhausted.
	 * 
	 * @param arr The sorted array to search through.
	 * @param key The value to search for.
	 * @return The index of the key if found, otherwise -1 if the key is not in the array.
	 * Time Complexity: O(log n), Space Complexity: O(1)
	 */	
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int target = 5;
		System.out.println("The search element found at index : " + binarySearch(arr, target));	
	}
	
	public static int binarySearch(int arr[] , int target) {
		int left = 0, right = arr.length-1;
		
		while(left <= right) {
			int mid = (left+ right)/2;
			int midElement  =  arr[mid];
			if(midElement == target) {
				return mid;
			} else if(midElement > target) {
				right  = mid-1;
			} else if (midElement < target) {
				left = mid+1;
			}
		}
		return -1;
	}
}

