/*
Author:  Chad Lister
Date:  02/13/2020

This program prompts the user to enter a number and displays a string by invoking format(number, width) using the following method header:
	public static String format(int number, int width)
	sample run given:  where 34, 4 input would produce 0034 output and where 100, 2 would produce 100
*/

import java.util.Scanner;

class Exercise_6_37 {
	public static void main(String[] args) {
		
		//  Create object
		Scanner input = new Scanner(System.in);
		
		//  Prompt for input
		System.out.println("Please enter a number?  ");
		int number = input.nextInt();
		System.out.println("Please enter its width?  ");
		int width = input.nextInt();
		
		//  Invoke method and display
		System.out.println(format(number, width));
	}
	
	public static String format(int number, int width) {
		
		String numberString = number + "";
		String output = "";
		String filler = "0";
		int leading = 0;
		
		//  If the number's length in digits is less than width given
		if (numberString.length() < width) {
			
			//  Get leading digits
			leading = width - numberString.length();
			
			//  Initialize temp string
			String temp = "";
			
			//  Pad output with leading digits
			do {
				temp = temp + filler;
				output = temp + numberString;
				leading--;
			}
			while (leading > 0);
			}
		else
		
		//  Output is number string
		output = numberString;
		
		return output; 
	}
	
}