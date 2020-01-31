/*
Author:  Chad LLister
Date:  01/28/2020

The program prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon using the 
formula side = (2 * radians * sin(PI / 5) to find the side length and using area = ((5 * ( side to the power of 2) / (4 * tan(PI / 5)).
*/

import java.util.Scanner;

class Exercise_4_1 {
	public static void main(String[] args) {
		
		// Declare variables and constant.
		// final double PI = 3.14159;		ommited due to math.PI method
		double radian = 0.0;
		double side = 0.0;
		double area = 0.0;
		
		// Create Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the length from the middle of the hexagon to a vertex.
		System.out.print("Please enter the length from the center of the hexagon to one of the vertices:  ");
		radian = input.nextDouble();
		
		// Calculate the side by using the following formula using java.Math methods.
		side = (2 * radian * Math.sin(Math.PI / 5));
		area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		// Display the Area to the screen.  Formated according to sample run given.
		System.out.printf("The Area of the pentagon is:  %4.2f", area);
	}
}