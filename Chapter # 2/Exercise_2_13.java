/*
Author:  Chad Lister
Date: 01/21/2020

This program asks the user to enter a monthly saving amount and displays the account value after the sixth month.  Given an annual interest rate of 5% or 0.00417/month.
*/

import java.util.Scanner;

class Exercise_2_13 {
	public static void main(String[] args) {
		
		// Create monthly interest constant based upon 5% A.P.R.
		// final double MONTHLY_INTEREST_RATE = 0.05 / 12;		// Ommitted at end.
		
		// Create a Scanner object and initialize variables at beginning.
		Scanner input = new Scanner(System.in);
		double monthlySavingAmount = 0.0;
		double balanceForward = 0.0;
		double balanceEnding = 0.0;
		
		// Prompt for monthly savings amount.
		System.out.print("Enter monthly saving amount:  $");
		monthlySavingAmount = input.nextDouble();
		
		// Calculate (monthly saving amount + balance forward) * (monthly interest rate) = ending balance.  6 times.
		balanceEnding = (monthlySavingAmount) * (1 + 0.00417);	// first month
		balanceForward = balanceEnding;
		balanceEnding = (monthlySavingAmount + balanceForward) * (1 + 0.00417);	// 2nd month
		balanceForward += balanceEnding;
		balanceEnding = (monthlySavingAmount + balanceForward) * (1 + 0.00417);	// 3rd month
		balanceForward += balanceEnding;
		balanceEnding = (monthlySavingAmount + balanceForward) * (1 + 0.00417);	// 4th month
		balanceForward += balanceEnding;
		balanceEnding = (monthlySavingAmount + balanceForward) * (1 + 0.00417);	// 5th month
		balanceForward += balanceEnding;
		balanceEnding = (monthlySavingAmount + balanceForward) * (1 + 0.00417);	// 6th month
		balanceForward += balanceEnding;
		
		// balanceEnding = (monthlySavingAmount + balanceForward) * (1 + MONTHLY_INTEREST_RATE);	possible 6 * calc for do loop.
		
		// Display results
		System.out.println("After the sixth month, the account value would be $" + balanceForward);		
	}
}