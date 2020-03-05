/*
Author:  Chad Lister
Date:  March 03/03/2020

This program prompts the user for 10 numbers and eliminates any duplicated numbers and returns a new array using the following method header given:

	public static int[] eliminateDuplicates(int[] list)
	
	Does NOT account for entry of zero integers or entering less than 10 numbers.
*/
import java.util.Scanner;

class Exercise_7_15 {
	public static void main(String[] args) {
		
		//  Initialize program.
		Scanner input = new Scanner(System.in);
		int [] array = new int [10];
		int distinctNumbers = 0;
		
		//  Prompt user for 10 numbers and load into an array of 10.
		System.out.print("Enter 10 numbers separated by a space:  ");
		for (int i = 0; i < array.length; i++)
		array[i] = input.nextInt();
		
		//  Pass array to method.
		eliminateDuplicates(array);
		
		//  For array returned get distinct numbers listed in sample run.
		for(int n = 0; n < array.length; n++) {
			if (array[n] != 0)
			distinctNumbers++;
		}

		//  Display distinct numbers and new array of distinct numbers less trailing zeros.
		System.out.println("The number of distinct numbers is:  " + distinctNumbers);
		System.out.print("Array without duplicates:  ");
		for (int e = 0; e < distinctNumbers; e++)
		System.out.print(array[e] + " ");
	}
	
	public static boolean linearSearch(int [] list, int key) {
		
		//  Set Bool flag
		boolean found = false;
		
		//  If the number is already in the non dup array flag it as found.
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
			found = true;
			
		}
	
	return found;
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		//  Initialize method variables with given header.
		int [] nonDup = new int [10];
		int index = 0;
		
		//  For the numbers entered previously
		for (int n = 0; n < list.length; n++) {
			
			//  Add number to key and check if found.
			int key = list[n];
			if (linearSearch(nonDup, key) == false) {
				
				//  If not found in nonDup array add it and increase index
				nonDup[index] = list[n];
				index++;
			}
			
		}
		
		//  Will not return the new array of nonDup so copy it to list.  when return without copy it returns original list not nonDup.
		System.arraycopy(nonDup, 0, list, 0 , nonDup.length);
			
	return nonDup;
	}
}