package com.ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FindTargetPrice {
	/**
	 * Nearest Temperature Range Program
	 * 
	 * A climate research center records daily temperature readings (in Celsius) across different cities.
	 * Each city has multiple daily temperature readings, and the research center needs to analyze these temperatures.
	 * You are given the average temperature recorded for each city.
	 * 
	 * The goal of this program is to help the research center identify the nearest average temperature that is
	 * within a specified temperature range. The average temperature for each city is provided in an array of double values.
	 * 
	 * The program performs the following tasks:
	 * 1. Reads an integer n, representing the number of cities.
	 * 2. Reads n double values into an array, representing the average temperatures of all cities.
	 * 3. Reads two double values, lowerBound and upperBound, representing the inclusive range of temperatures to consider.
	 * 4. Reads a double value targetTemperature, which is the temperature you are trying to find the closest match to.
	 * 5. Finds the closest average temperature to the targetTemperature within the range [lowerBound, upperBound].
	 * 6. If multiple temperatures are equally close to targetTemperature, the program selects the lower temperature among them.
	 * 7. If no temperatures fall within the specified range, the program prints "No temperature found in the specified range."
	 * 
	 * Constraints:
	 * - 1 <= n <= 2000 (Total number of cities)
	 * - -50.0 <= temperature <= 50.0 (Range of valid average temperatures for each city)
	 * - -50.0 <= lowerBound <= upperBound <= 50.0 (Range constraints for the given bounds)
	 * - -50.0 <= targetTemperature <= 50.0 (Target temperature to compare)
	 * 
	 * Input Format:
	 * - The first line contains a single integer n, representing the number of cities.
	 * - The second line contains n double values, representing the average temperatures of all cities.
	 * - The third line contains two double values, lowerBound and upperBound, representing the inclusive range of temperatures to consider.
	 * - The fourth line contains a single double value targetTemperature, the temperature to compare against.
	 * 
	 * Output Format:
	 * - If a temperature within the specified range is found, the program prints the closest temperature to targetTemperature.
	 * - If no temperature falls within the range, the program prints "No temperature found in the specified range."
	 * 
	 * Example:
	 * 
	 * Input:
	 * 5
	 * 20.5 15.0 25.0 30.5 10.0
	 * 15.0 25.0
	 * 18.0
	 * 
	 * Output:
	 * 20.5
	 * 
	 * Explanation:
	 * - The temperatures for each city are [20.5, 15.0, 25.0, 30.5, 10.0].
	 * - The valid range is [15.0, 25.0].
	 * - The target temperature is 18.0.
	 * - The closest temperature to 18.0 within the range is 20.5.
	 * 
	 * This program can be used to help climate researchers find the closest average temperature to their target
	 * temperature within a specified range, allowing them to analyze temperature data more effectively.
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        // Number of cities
	        int n = sc.nextInt();
	        double[] temperatures = new double[n];
	        
	        // Read the temperatures of the cities
	        for (int i = 0; i < n; i++) {
	            temperatures[i] = sc.nextDouble();
	        }

	        // Read lower and upper bounds for temperature range
	        double lowerBound = sc.nextDouble();
	        double upperBound = sc.nextDouble();

	        // Read target temperature
	        double targetTemperature = sc.nextDouble();
	        nearestTempRange(temperatures, lowerBound, upperBound,targetTemperature);
	        
	}
	
	public static void nearestTempRange(double []temperatures , double lb, double ub , double targetTemperature) {
		 // Initialize variables for closest temperature search
        boolean foundInRange = false;
        double closestTemperature = Double.MAX_VALUE;
        double minDifference = Double.MAX_VALUE;

        // Search for the closest temperature in the range
        for (int i = 0; i <= temperatures.length-1; i++) {
            if (temperatures[i] >= lb && temperatures[i] <= ub) {
                foundInRange = true;
                double difference = Math.abs(temperatures[i] - targetTemperature);
                if (difference < minDifference) {
                    minDifference = difference;
                    closestTemperature = temperatures[i];
                }
            }
        }
        
        // Output the result
        if (foundInRange) {
            System.out.println("Closest temperature: " + closestTemperature);
        } else {
            System.out.println("No temperature found in the specified range.");
        }
        
       
    }
}