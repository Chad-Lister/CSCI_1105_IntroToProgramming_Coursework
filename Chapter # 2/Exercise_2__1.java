/*
Author:  Chad Lister
Date:  01/21/2020

This program reads a Celsius degree, defined as a double, and outputs the temperature as Cellsius is Fahrenheit .
*/

import java.util.Scanner;

class Exercise_2_1 {
	public static void main(String[] args) {
		
		// Creates a Scanner object and initializes variables at beginning.
		Scanner input = new Scanner(System.in);
		double degreesInCelsius = 0.0;
		double degressInFahrenheit = 0.0;
		
		// Prompt the user for a temperature in Celsius.
		System.out.print("Please enter a temperature in Celsius:  ");
		degreesInCelsius = input.nextDouble();
		
		// Do Celsius to Fahrenheit conversion.
		degressInFahrenheit = ((9.0 / 5) * degreesInCelsius) + 32.0;
		
		// Display result to screen
		System.out.println(degreesInCelsius + " degrees Celsius is " + degressInFahrenheit + " degrees Fahrenheit.");
	}
}