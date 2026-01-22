package com.ArrayProblems;

import java.util.*;

public class MaxMeetings {
	    public static int maxMeetings(int[] start, int[] end) {
	    		        
	    	         // Your code here
	    			 for(int i=0;i<end.length-1;i++) {
	    				 
	    				 int min=end[i];
	    				 int pos=i;

	    				 for(int j=i+1;j<=end.length-1;j++) {

	    					 if(end[j]<min) {
	    						 min=end[j];
	    						 pos=j;
	    					 }
	    				 }
	    				 //swap end[i] and end[pos]
	    				 int tempend=end[i];
	    				 end[i]=end[pos];
	    				 end[pos]=tempend;

	    				 //swap start[i] and start[pos]
	    				 int tempstart=start[i];
	    				 start[i]=start[pos];
	    				 start[pos]=tempstart;
	    			 }

	    			 int count=0;
	    			 int lastEnd=-1;
	    			 for(int i=0;i<=start.length-1;i++) {
	    				 if(start[i]>lastEnd) {
	    					 count++;
	    					lastEnd= end[i];
	    				 }
	    			 }
	    		        return count;
	    		    }
	    
	    
	    		    public static void main(String[] args) {
	    		        Scanner scanner = new Scanner(System.in);

	    		        int n = scanner.nextInt();

	    		        int[] start = new int[n];

	    		        int[] end = new int[n];

	    		        for (int i = 0; i < n; i++) {
	    		            start[i] = scanner.nextInt();
	    		        }

	    		        for (int i = 0; i < n; i++) {
	    		            end[i] = scanner.nextInt();
	    		        }

	    		        System.out.println(maxMeetings(start, end));
	    		        scanner.close();
	    		    }
	    	}