/*
Author:  Chad Lister
Date:  03/06/2020

(Guess the capitals) This program repeatedly prompts the user to enter a capital for a state.  Upon receiving the user input, the program reports whether the answer is correct.  Assume that 10 states and their capitals are stored in a two-dimensional array, as shown in Figure 8.10.  The program prompts the user to answer states’ capitals and displays the total correct count.  The user’s answer is not case-sensitive.

	Exercise 8.37 in the book.
	
	Sample run:  What is the capital of Alabama?  Montogomery [enter]
				 The correct answer should be Montgomery
				 What is the capital of Alaska?  Juneau [enter]
				 Your answer is correct
				The correct count is 

*/

import java.util.Scanner;

class Exercise_8_37 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//  Commented out for test only.
//		String [][] stateCapitals = new String[10][10];
		
		String [][] stateCapitals = {
			{"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
		};
		int correctCount = 0;
		
		for (int e = 0; e < stateCapitals[0].length + 1; e++) {
			
			System.out.print("What is the capital of " + stateCapitals[e][0] + "?  ");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(stateCapitals[e][1]) == true) {
				correctCount++;
				System.out.println("Your answer is correct");
			}
			else if (answer.equalsIgnoreCase(stateCapitals[e][1]) == false){
				System.out.println("The correct answer should be " + stateCapitals[e][1]);
			}
		}
		System.out.println("The correct count is " + correctCount);
	}
}