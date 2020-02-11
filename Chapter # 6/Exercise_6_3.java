/*
Author:  Chad Lister
Date:  02/10/2020

This program prompts the user to enter a digit and then checks if it is a palindrom using the following methods headers:

public static int reverse(int number)
public static boolean isPalindrome(int number)
*/

import java.util.Scanner;

class Exercise_6_3 {
	public static void main(String[] args) {
		
		// Create Object
		Scanner input = new Scanner(System.in);
		
		//  Prompt
		System.out.print("Please enter a digit to check?  ");
		int number = input.nextInt();
		
		
		//  Invoke isPalindrome method and display
		System.out.println("Is this digit a palindrome?  " + isPalindrome (number));
		}
	
	public static int reverse(int number) {
		
		//  Declare and change int to string
		String reverseOfDigits = "";
		String originalDigits = number + "";
		
		//  Set beginning index to last digit
		int index = originalDigits.length();
		
		
		//  While there's still a digit left
		while (index >= 1) {
			
			//  Add the digit to digit string (Append)
			reverseOfDigits = reverseOfDigits.concat(originalDigits.substring(index-1, index));
			index--;
		}
		
		//  Change string back to int
		int reverseNumber = Integer.parseInt(reverseOfDigits);
		
		return reverseNumber;
	}
	
	public static boolean isPalindrome(int number) {
		
		//  Declare Boolean and original number
		boolean result = false;
		int originalNumber = number;
		
		// Invoke reverse method and declare that as reverseNumber		
		int reverseNumber = reverse(number);
		
		//  If reverse number matches original number
		if (originalNumber == reverseNumber)
		result = true;
		
		return result;
	}
}