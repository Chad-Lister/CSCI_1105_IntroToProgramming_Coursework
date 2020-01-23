/*
Author:  Chad Lister
Date:  01/23/2020

This program prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price of gas per gallon.  It then evaluates the cost of the trip and displays the result.
*/
import java.util.Scanner;

class Exercise_2_23 {
	public static void main(String[] args) {
		
		// Creat Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize the variables.
		double drivingDistance = 0.0;
		double milesPerGallon = 0.0;
		double pricePerGallon = 0.0;
		double totalTripCost = 0.0;
		
		// Prompt user for the distance of the trip.
		System.out.print("Please enter the distance of your trip in miles:  ");
		drivingDistance = input.nextDouble();
		
		// Prompy user for the fuel efficieny in miles per gallon.
		System.out.print("Please enter you vehicles fuel efficiency in miles per gallon:  ");
		milesPerGallon = input.nextDouble();
		
		//  Prompt user for the price of gas per gallon.
		System.out.print("Please enter the price of gas per gallon:  ");
		pricePerGallon = input.nextDouble();
		
		// Calculate the cost of the trip using cost = (distance in miles / miles per gallon) * price per gallon.
		totalTripCost = (int) (((drivingDistance / milesPerGallon) * pricePerGallon) * 100) / 100.0;	// added two decimal output for money.
		
		// Display cost to screen.
		System.out.println("The cost of gas for the trip would be $" + totalTripCost);
	}
}