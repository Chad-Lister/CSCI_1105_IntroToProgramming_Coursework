/*
Author:  Chad Lister
Date:  

This program takes an array of student's names and stores their days absent, exam scores and filters the display output according to the user selection.  It's purpose is to flag students with poor attendance or faltering grades so teachers and educators can stay informed of struggling students.
*/

import java.util.Scanner;

class Final_Project_Java_Format
 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//  Initialize file fields.
		String [] lastName = {"Flay", "Brown", "Jones", "Peters", "Ash"};
		String [] firstName = {"Bobby", "Lisa", "Scott", "Doug", "Shay"};
		double [] attendence = {78, 99, 60, 100, 80};
		double [] gradeAverage = {68, 99, 89, 75, 45};
        
		//  Display original file.
		System.out.println("Original File");
		System.out.println();
        System.out.print(" Last Name, First Name \t Attendence % \t Grade Average %\n");
        System.out.println("--------------------------------------------------------");
		for (int s = 0; s < lastName.length; s++) {
	//		System.out.printf("| " + "%-12s", lastName[s] + "," + "%-12s", firstName[s] + " |" + "%8d", attendence[s] + " |" + "%8d", gradeAverage[s] + " |\n");
	//		System.out.printf("%2s %-10s %2s % 10s %2s %8d %2s %8d %2s \n", "| ", lastName[s], ", ",  firstName[s], " |", attendence[s] , " |", gradeAverage[s], " |");
			System.out.printf("%s %-8s %s %-8s %s %10.2f %s %10.2f %s", "|", lastName[s], ",",  firstName[s], " | ", attendence[s] , "  | ", gradeAverage[s], "  |\n");
		}
		System.out.println("--------------------------------------------------------");
			
        int sortFilter = 0;
		System.out.println();

		//  Get sort key field.
        do {
            
            System.out.print("Sort criteria (1 = by Last Name, 2 = by Attendence Rate, 3 = by Grade Average, or 4 = Exit :  ");
		    sortFilter = input.nextInt();
		
			if (sortFilter == 2)
			//  Sort by attendence.
			    sortArray(attendence, lastName, firstName, gradeAverage);

			//  Sort by grade average.
		    else if (sortFilter == 3)
			    sortArray(gradeAverage, lastName, firstName, attendence);

			//  Sort by last name.
		    else if (sortFilter == 1) 
		    sortAlpha(lastName, firstName, attendence, gradeAverage);
			
			//  Display sorted file.
			System.out.println();
			System.out.println("Sorted File");
			System.out.println();
			System.out.print("Last Name, First Name \t Attendence % \t Grade Average %\n");
			System.out.println("--------------------------------------------------------");
			for (int s = 0; s < lastName.length; s++) {
				System.out.printf("%s %-8s %s %-8s %s %10.2f %s %10.2f %s", "|", lastName[s], ",",  firstName[s], " | ", attendence[s] , "  | ", gradeAverage[s], "  |\n");
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
		} while (sortFilter != 4);
		//  Exit loop and end.
	}
		
		public static void sortArray(double key[], String [] lastName, String [] firstName, double [] temp){
			
			double temp2 = 0.0;
			String stringTemp = "";
			
			//  For every indices in file.
			for (int i = 0; i < key.length - 1; i++) {
				
				//  Compare against all indices.
				for (int e = 0; e < key.length - 2; e++){
					
					//  If greater than next, move it down.
					if (key [e] >= key [e + 1]){
						temp2 = key [e];
						key [e] = key [e + 1];
						key [e + 1] = temp2;
					
						temp2 = temp [e];
						temp [e] = temp [e + 1];
						temp [e + 1] = temp2;
					
						stringTemp = firstName [e];
						firstName [e] = firstName [e + 1];
						firstName [e + 1] = stringTemp;
						stringTemp = lastName [e];
						lastName [e] = lastName [e + 1];
						lastName [e + 1] = stringTemp;
					}
				}
			}
			return;	
        }
        
		public static void sortAlpha(String key[], String [] firstName, double [] attendence, double [] gradeAverage) {

            double temp = 0.0;
            String tempString = "";

			//  For every student's name in file.
            for (int s = 0; s < key.length - 1; s++) {

				//  Compare against next name.
                for (int n = 0; n <= key.length - 2; n++) {

                    int a = key [n].compareToIgnoreCase(key [n + 1]);

					//  If it's lower alphabetically:  ie, has a negative value.  Move it down.
                    if (a > 0) {
                        tempString  = key [n];
						key [n] = key [n + 1];
                        key [n + 1] = tempString;

                        tempString = firstName [n];
                        firstName [n] = firstName [n + 1];
                        firstName [n + 1] = tempString;

                        temp = attendence [n];
                        attendence [n] = attendence [n + 1];
                        attendence [n + 1] = temp;

                        temp = gradeAverage [n];
                        gradeAverage [n] = gradeAverage [n + 1];
                        gradeAverage [n + 1] = temp;
                    }
                }
            }
            return;
        }
}
	
