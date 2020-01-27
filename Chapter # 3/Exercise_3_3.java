/*
Author:  Chad Lister
Date:  01/27/2020

This program prompts the user to enter a number for variables a, b, c, d, e, and f.  It then uses Cramer's rule to solve for x and y, or displays the message that you cannot divide by zero if (a * d) - (b * c) is equal to zero. 
*/

import java.util.Scanner;

class Exercise_3_3 {
	public static void main(String[] args) {
		
		// Create new Scanner object.
		
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize variables.
		
		double a , b , c , d , e , f , x , y = 0.0;
		
		// Prompt user for a, b, c, d, e, and f.
		
		System.out.print("Enter a:  ");
		a = input.nextDouble();
		System.out.print("Enter b:  ");
		b = input.nextDouble();
		System.out.print("Enter c:  ");
		c = input.nextDouble();
		System.out.print("Enter d:  ");
		d = input.nextDouble();
		System.out.print("Enter e:  ");
		e = input.nextDouble();
		System.out.print("Enter f:  ");
		f = input.nextDouble();
		
		// Check for zero division error.
		
		if ((a * d) - (b * c) == 0)							// No bracket needed for single command.
			System.out.println("Cannot divide by zero.");
		
		else {
		// Calculate for x and y.
			x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		// Display x and y to screen.
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}