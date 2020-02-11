/*
Author:  Chad Lister
Date:  02/07/2020

This program prommpts the user for n and randomly generates either a 1 or 0 and displays a n-by-n matrix using the method header given for exercise.
*/
import java.util.Scanner;

class Exercise_6_17 {
	public static void main(String[] args) {
		
		//  Declare, initialize and create.
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a dimension of the matrix?  ");		// Optional display output.
		n = input.nextInt();
//		System.out.println();
		
		//  Invoke method with n.
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		
		//  Declare width as n and max number of elements as n * n.
		int width = 1;
//		int length = 1;
		int max = n * n;
		
		//  Initialize an accumulator, test it against max, and advance thru loop.  If i = 1 then i <= max.
		for (int i = 0; i < max ; i++) {
			
			//  Inittialize digit to 1.
			int digit = 1;
			
			//  Generate random number.
			double ranVar = (Math.random() * 10);
			
			//  If random is less than 5.
			if (ranVar > 5) {
				
				//  Digit is set to 0.
				digit = 0;
			}
			
			// If width is less than n. still on row.
			if (width < n) {
				System.out.print(digit);
				width++;
			}
			//  Otherwise print last digit in row and carriage return and reset width to 1
			else if (width == n) {
				System.out.println(digit);
				width = 1;
			}
		}
		return;
	}
}