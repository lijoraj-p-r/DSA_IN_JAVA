package com.ArrayProblems;

import java.util.Scanner;


public class SortInReverseOrder {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // Number of students
            int n = sc.nextInt();
            
            // Array to store exam scores
            float[] scores = new float[n];
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextFloat();
            }
            
            // Write your code here to sort the scores using Bubble Sort
            bubbleSort(scores);
            System.out.print("Sorted Scores: ");
            for(int i=0;i<=scores.length-1;i++) {
                System.out.print(scores[i]+" ");
            }
        }
    
      public static void bubbleSort(float arr[]) {
          for(int i=0;i<=arr.length-2;i++) {
              for(int j=0;j<=arr.length-2-i;j++) {
                  if(arr[j]<arr[j+1]) {
                      float temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
              }
          }
          
      }
}

