/*
Author:  Chad Lister
Date:  02/06/2020

This program prompts the user to enter a string and counts it's vowels and consonants given A, E, I, O, and U as valid vowels.  Does NOT make exceptions for digits or wildcards.

*/

import java.util.Scanner;
class Exercise_5_49 {
	public static void main(String[] args) {
		
		//  Declare and initialize variables.
		final String vowelString = "AEIOU";
		String initialString = "";
		String displayString = "";
		String character = " ";
		int stringLength = 0;
		int characterIndex = 0;
		int vowelCount = 0;
		int consonantCount = 0;
		
		//  Create Scanner object.
		Scanner input = new Scanner(System.in);
		
		//  Prompt user for string and get it's length.  Length is Do Loop Termination.  Upper Case conversion.
		System.out.print("Please enter a string of characters?  ");
		initialString = input.nextLine();
		displayString = initialString;
		stringLength = initialString.length();
		initialString = initialString.toUpperCase();
		
		//  While Character Index is less than String Length
		while (characterIndex < stringLength) {

		//	character = initialString.charAt(characterIndex);
			character = initialString.substring(characterIndex, characterIndex + 1);
			
			//  If it's a vowel add it to count and increment index
			if (vowelString.contains(character)) {
				vowelCount++;
				characterIndex++;
			}
			
			//  Otherwise add it to consonant count and increment index.
			else {
				consonantCount++;
				characterIndex++;
			}
		}
		//  Display counts to screen.
		System.out.println("For the string you entered.  " + displayString);
		System.out.println("Vowel count is:  " + vowelCount);
		System.out.print("Consonant count is:  " + consonantCount);	}
}