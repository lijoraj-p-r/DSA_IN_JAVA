package com.GeneralProblems;

public class NestedLoopFor {

	public static void main(String [] args) {
		System.out.println("Run started");
		
		outerLoop:
			
		for(int i =0; i <= 5; i++) {
			
			for(int j = 0; j <= 5; j++) {
				System.out.println("i is" + i + ", j is " +j);
				if(i==2) {
					System.out.println("Loop breaked");
					continue outerLoop;
				}
			}
		}
		
		}
}
