package com.TwoPointerApproach;

import java.util.Arrays;
import java.util.Scanner;

public class SumFind {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        // Write your code here...
	        int n=scan.nextInt();
	        int numbers[]=new int[n];
	        for(int i=0;i<=numbers.length-1;i++) {
	            numbers[i]=scan.nextInt();
	        }
	        
	        int target=scan.nextInt();
	        int  result[]=twoSum(numbers, target);
	        System.out.println(Arrays.toString(result));
	        
	    }
	    
	    public static int[] twoSum(int numbers[], int target) {
	        int left=0;
	        int right=numbers.length-1;
	        
	        while(left<right) 
	        {
	            int sum=numbers[left]+numbers[right];
	            
	            
	            if(sum==target) {
//	              int result[] = new int[2];
//	              result[0]=left+1;
//	              result[1]=right+1;
	                
	                return new int[] {left+1,right+1};
	            }
	            else if(sum<target) {
	                left++;
	            }
	            else {
	                right--;
	            }
	        }
	        
	        return new int[] {-1,-1};   
	        
	    }
	}

