/*
 * Aaron Stahley
 * 9/14/2016
 * SER215
 */
package assignment_03_Part_02;

import java.io.FileNotFoundException;

public class EmployeeWorkHours {

	public static void main(String[] args) throws FileNotFoundException {
		
		ReadFile rf = new ReadFile();
		rf.readFile("C:\\inputData.txt"); // Enter the file you want to read. 
		rf.addHours(); // adds all the hours of each employee
		rf.sortArray(); // sorts the employees from greatest to least based on hours worked.
		rf.printArray(); // prints the sorted values. 

	}

}
