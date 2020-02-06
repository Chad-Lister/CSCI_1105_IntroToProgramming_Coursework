/*
Author:  Chad Lister
Date:  02/03/2020

This program displays all the numbers from 100 to 200, ten per line and seperated by one space; if they are divisible by 5 or 6, but not by both.
*/
class Exercise_5_11 {
	public static void main(String[] args) {
		
		// Line count initialization.
		int lineCount = 1;
		
		//  Initial Display.  As per sample run.
		System.out.println("Counting from 100 - 200");
		System.out.println("Divisible by 5 or 6, but not 5 and 6");
		System.out.println("---------------------------------------");
		
		//  For numbers from 100 to 200.
		for (int number = 100; number <= 200; number++) {
			
			// If divisible by 5 or 6 but not both.
			if ((number % 5 == 0) ^ (number % 6 ==0)) {
				
				// If less than or equal to the 10th number in line.
				if (lineCount < 10) {
					System.out.print(number + " ");
					lineCount++;
				}
				
				//  Else Carriage return and reset line count.
				else {
					System.out.println(number);
					lineCount = 1;
				}
					
			}
		}
	}
}