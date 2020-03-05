/*
Author:  Chad Lister
Date:  03/05/2020

(Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on the first day of school. As the students enter, the first student, denoted S1, opens every locker. Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.

After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer and display all open locker numbers separated by exactly one space.

(Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open ( true ) or closed ( false ). Initially, all lockers are closed.)

You can use a nested for loops to increment the student selection, and close the lockers. Finally, you can use a for loop to display which lockers are still open.

Example output:

	the open lockers are: ???????
	
	NOTE:  Possible shortening for using square of factors of 10. 1 * 1 = 1, 2 * 2 = 4, 3 * 3 = 9, etc.
*/

class Exercise_7_23 {
	public static void main(String[] args) {
		
		boolean [] lockerStatus = new boolean [100];
		
		//  Initialize array all false or closed.
		for (int e = 0; e < lockerStatus.length; e++)
			lockerStatus[e] = false;
		
		//  Process all 100 students.
		for (int s = 1; s <= 100; s++) {
			
		//  Start at locker element equal to student # -1.  Increment by student number 3, 6 ,9 , etc.
			for (int l = s - 1; l < lockerStatus.length; l += s ) {
				
		//  If it is Open (TRUE), Close it (FALSE) and vice versa.
				if (lockerStatus[l] == true) {
					lockerStatus[l] = false;
				} 
				else if (lockerStatus[l] == false) {
					lockerStatus[l] = true;
					}
			}
		}
			
			
		//  Check and display Open (TRUE) lockers.

		System.out.print("The open lockers are (L1 thru L100):  ");
		for (int l = 0; l < lockerStatus.length; l++) {
			if (lockerStatus[l] == true) {
				System.out.print("L" + (l + 1) + " ");
			}
		}
		
	}
	
}