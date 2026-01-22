package com.StringProblems;

import java.util.Scanner;

public class FindSubsequence {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        String s = scanner.nextLine();
	        String t = scanner.nextLine();
	        
	        System.out.println(isSubsequence(s, t));
	        scanner.close();
	    }

	    public static boolean isSubsequence(String s, String t) {
	        int i = 0, j = 0;

	        while (i < s.length() && j < t.length()) {
	            if (s.charAt(i) == t.charAt(j)) {
	                i++;
	            }
	            j++;
	        }
	        return i == s.length();
	    }
	}