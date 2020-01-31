/*
Author:  Chad Lister
Date 01/31/2020

The program reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
*/

import java.util.Scanner;

class Exercise_4_23 {
	public static void main(String[] args) {
		
		// Declare annd initialize variables.  Line by line for easy reading.
		double hoursWorked = 0.0;					//  Could use Byte type if only whole hours counted.
		double hourlyRate = 0.0;
		double federalWithholdingRate = 0.0;
		double stateWithholdingRate = 0.0;
		double grossPay = 0.0;
		double federalTax = 0.0;
		double stateTax = 0.0;
		double totalDeduction = 0.0;
		double netPay = 0.0;
		
		// Create Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter employee's name.
		System.out.print("Please enter employee's name (Last, First):  ");
		String employeeName = input.nextLine();									// Possible declaration at beginning.
		
		// Prompt user for number of hours worked.
		System.out.print("Please enter the number of hours they worked:  ");
		hoursWorked = input.nextDouble();
		
		// Prompt user for their hourly pay rate.
		System.out.print("Please enter their hourly pay rate:  $");
		hourlyRate = input.nextDouble();
		
		// Prompt user for federal tax withholding rate.
		System.out.print("Please enter their federal tax withholding rate:  ");
		federalWithholdingRate = input.nextDouble();
		
		// Prompt user for state tax withholding rate.
		System.out.print("Please enter their state tax withholding rate:  ");
		stateWithholdingRate = input.nextDouble();
		
		//  Calculate gross pay, federal tax, state tax, total deductions, and net pay.
		grossPay = hoursWorked * hourlyRate;
		federalTax = federalWithholdingRate * grossPay;
		stateTax = stateWithholdingRate * grossPay;
		totalDeduction = federalTax + stateTax;
		netPay = grossPay - totalDeduction;
		
		//  Display the information formatted in a payroll statement to the screen.  Possible right justification to payroll statement dollar amount output.
		System.out.println();
		System.out.println("Employee Name:  " + employeeName);
		System.out.println("Hours Worked:  " + hoursWorked);
		System.out.printf("Pay Rate:  $%4.2f\n", hourlyRate);
		System.out.printf("Gross Pay:  $%4.2f\n", grossPay);
		System.out.printf("Deductions:\n");
		System.out.printf("\tFederal Withholding (%.2f%%):  $%4.2f\n", federalWithholdingRate, federalTax);
		System.out.printf("\tState Withholding (%.2f%%):  $%4.2f\n", stateWithholdingRate, stateTax);
		System.out.printf("\tTotal Deduction:  $%4.2f\n", totalDeduction);
		System.out.printf("Net Pay:  $%4.2f", netPay);								//  Formated as currency even though sample run isn't.
		}
}