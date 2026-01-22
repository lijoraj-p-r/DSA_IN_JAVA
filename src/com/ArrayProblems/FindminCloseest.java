package com.ArrayProblems;

import java.util.Scanner;

public class FindminCloseest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of student scores
        int n = sc.nextInt();
        short[] scores = new short[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextShort();
        }
        // Target score to compare
        short targetScore = sc.nextShort();
        // write your code here
        short closestScore = scores[0];
        
        int mindifference = Math.abs(scores[0]-targetScore);
        
        for(int i=1;i<=scores.length-1;i++) {
        	
        	int difference = Math.abs(scores[i]-targetScore);
        	
        	if(difference<mindifference || (difference==mindifference && scores[i]<closestScore)) {
        		
        		mindifference=difference;
        		
        		closestScore=scores[i];
        	}
        }
        System.out.println(closestScore);

    }

}