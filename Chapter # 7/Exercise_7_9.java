/*
Author:  Chad Lister
Date:  02/24/2020

This program prompts the user to enter 10 numbers and then uses a method to find the smallest element in that list.  Might need more than 10 numbers check.
*/
import java.util.Scanner;

public class Exercise_7_9 {
	public static void main(String[] args) {
		
		//  Create scanner object.
		Scanner input = new Scanner(System.in);
		
		//Initialize array woth 10 elements of double.
		double [] array = new double [10]; 
		
		//  Prompt user for 10 numbers and load them into the array.
		System.out.print("Please enter 10 numbers seperated by a space:  ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
			
		}
		
		//  Invoke method and print to screen the smallest value.
		System.out.println("The minumum number is:  " + min(array));
		
	}
		//  Find smallest value of the 10.
	public static double min(double[] array) {
		
		//  First element is max and smallest.
		double max = array[0];
		double smallestElement = array[0];
		
		//  For the numbers in array.
		for (int i = 0; i < array.length; i++) {
			
			//  If its bigger than any previous number.
			if (array[i] > max)
			max = array[i];
			//  If its smaller than any previoous number.
			else if (array[i] < smallestElement)
			smallestElement = array[i];
			}
			
		return smallestElement;	
	}
}