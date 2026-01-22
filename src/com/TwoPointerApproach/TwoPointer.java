package com.TwoPointerApproach;

import java.util.Scanner;

public class TwoPointer {
	
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			// Write your code here...

			int n=scan.nextInt();

			int height[] = new int[n];



			for(int i=0;i<=height.length-1;i++) {

				height[i]=scan.nextInt();

			}

			int result=maxArea(height);

			System.out.println(result);

		}


		public static int maxArea(int []height) {

			//write the entire

			int left=0;

			int right = height.length-1;

			int maxArea=0;


			while(left<right) {

				int width = right-left;

				int currentLength=Math.min(height[left], height[right]);



				int currentArea = width*currentLength;



				//maxArea=Math.max(maxArea, currentArea);

				if(currentArea>maxArea) {

					maxArea=currentArea;

				}

				if(height[left]<height[right]) {

					left++;

				}

				else {

					right--;

				}

			}

			return maxArea;

		}

	}

