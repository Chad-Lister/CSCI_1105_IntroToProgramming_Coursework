package final_project_csci_1105;

import java.util.Scanner;

/**
 * <h1>final_project_csci_1105</h1>
 * <p>This program uses parallel arrays to simulate a database external file.  It displays the file and filters the display output according to the user selection.  It's purpose is to flag students with poor attendance or faltering grades so teachers and educators can stay informed of struggling students.</p>
 * 
 * <p>Created: 03/26/2020</p>
 * @author Chad Lister
*/

class final_project_csci_1105 {
	
	/**
	 * This is the main method that initializes file input by using file fields defined as parallel arrays.  Displays the file and then prompts the user for a sorting criteria; either by one of the listed percentages or by the default alphabetically.  Depending on what option is chosen, it uses that field as a key to sort the array.
	*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//  File setup.  Field names and values.
		String [] lastName = {"Flay", "Brown", "Jones", "Peters", "Ash"};
		String [] firstName = {"Bubba", "Lisa", "Scott", "Doug", "Shay"};
		double [] attendence = {78, 99, 60, 93, 80};
		double [] gradeAverage = {68, 99, 89, 75, 45};
		
		//  Display file before sort criteria.
		System.out.print("Last Name, " + "First Name" + "\tAttendance %"+ "\tGrade Average % \n");
		System.out.println("______________________________________________");
		for (int s = 0; s < lastName.length; s++) {
			System.out.print("| " + lastName[s] + ", " + firstName[s] + "\t|\t" + attendence[s] + "\t|\t" + gradeAverage[s] + " | \n");
			}
		
		//  Prompt for sort option.  Default is last name alphabetically.
		System.out.println();
		System.out.println("Sort criteria (1 = by Last Name, 2 = by Attendance Rate, or 3 = by Grade Average) :  ");
		int sortFilter = input.nextInt();
		
		//  Use sort filter to key sort array method.
		if (sortFilter == 2) {
			sortArray(attendence, lastName, firstName, gradeAverage);
		}
		else if (sortFilter == 3) {
			sortArray(gradeAverage, lastName, firstName, attendence);
		}
		else {
			// Default key.
			sortAlpha(lastName, firstName, attendence, gradeAverage);
		}
		
		//  Display printed array.
		System.out.println();
		System.out.println("Sorted Array (File)");
		System.out.println("______________________________________________");
		for (int s = 0; s < lastName.length; s++) {
			System.out.print("| " + lastName[s] + ", " + firstName[s] + "\t|\t" + attendence[s] + "\t|\t" + gradeAverage[s] + " | \n");
			}
	}
	
	/**
	 * This method sorts the array (file) by the selected criteria.   Attendance or grade average  or by last name alphabetically (default). 
	 * @param key (double;  Represents the field name to sort by (key), either attendance or grade average.  Both double values.)
	 * @param lastName (String;  The student's last name followed by a "," for printing.)
	 * @param firstName (String;  The students's first name.)
	 * @param temp (double; Represents the secondary double field which is not the key.)
	 */
		
		public static void sortArray(double key[], String [] lastName, String [] firstName, double [] temp){
			
			double temp2 = 0.0;
			double temp3 = 0.0;
			String stringTemp = "";
			
			//  For indices in array.
			for (int i = 0; i < key.length - 1; i++) {
				
				//  For each/every indices.
				for (int e = 0; e < key.length - 1; e++){
					
					//  Swap higher for lower.
					if (key [e] >= key [e + 1]){
						temp3 = key [e];
						key [e] = key [e + 1];
						key [e + 1] = temp3;
					
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

		/**
		 * This method sorts the array (file) alphabetically by last name.
		 * @param lastName (String;  Represents the key field to be sorted by.)
		 * @param firstName (String;  Represents the students first name.)
		 * @param attendence (double;  Represents the student's attendance %.)
		 * @param gradeAverage (double;  Represents the student's grade average %.)
		 */
		
		public static void sortAlpha(String [] lastName, String [] firstName, double [] attendence, double [] gradeAverage){
			
			String stringTemp = "";
			double present = 0.0;
			double grade = 0.0;
			
			//  For the names in the array (file).
			for (int n = 0; n < lastName.length - 1; n++) {
				
				//  For each name.
				for (int s = 0; s < lastName.length - 1; s++){
					
					//  Alphabetical check against next.
					int a = lastName [s].compareToIgnoreCase(lastName [s + 1]);
					
					//  If it's a negative number (ie; lower alphabetically).
					if (a >= 0) {
						
						stringTemp = firstName [s];
						firstName [s] = firstName [s + 1];
						firstName [s + 1] = stringTemp;
						stringTemp = lastName [s];
						lastName [s] = lastName [s + 1];
						lastName [s + 1] = stringTemp;
						
						present = attendence [s];
						attendence [s] = attendence [s + 1];
						attendence [s + 1] = present;
						
						grade = gradeAverage [s];
						gradeAverage [s] =  gradeAverage [s +1];
						gradeAverage [s + 1] = grade;
						
						}
				}
			}
			return;
		}
}
	
