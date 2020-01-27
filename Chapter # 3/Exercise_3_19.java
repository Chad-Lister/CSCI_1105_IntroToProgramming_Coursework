/*
Author:  Chad Lister
Date: 01/27/2020

This program prompts the user to enter 3 sides of a triangle and displays the perimeter of the triangle if the sum of 2 sides are greater than the 3rd.  Otherwise it displays that the input is invalid.  a + b > c evaluates to p = a + b + c while a + b < c evaluates to "Invalid input."
*/
import java.util.Scanner;

class Exercise_3_19 {
	public static void main(String[] args) {
		
		// Declare and initialize variables.
		double sideA, sideB, sideC, perimeter = 0.0;
		
		// Create scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the length of 3 sides of a triangle.
		System.out.print("Please enter the length of side a:  ");
		sideA = input.nextDouble();
		System.out.print("Please enter the length of side b:  ");
		sideB = input.nextDouble();
		System.out.print("Please enter the length of side c:  ");
		sideC = input.nextDouble();
		
		// Boolean check to see if the sum of 2 sides is greater than the 3rd.
		if (sideA + sideB > sideC) {
			
			// Calculate p = a + b + c and display to screen.
			perimeter = sideA + sideB + sideC;
			System.out.println("The perimeter of a triangle with these sides is :  " + perimeter);
		}
		
		// Otherwise display error message.
		else
			System.out.println("Invalid input to form a triangle.  Sum of 2 sides should be greater than the third.");
	}
}