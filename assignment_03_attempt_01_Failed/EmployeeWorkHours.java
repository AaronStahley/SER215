package assignment_03_attempt_01_Failed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.io.IOException;

public class EmployeeWorkHours {

	public static void main(String[] args) throws IOException, ParseException {
		
		String inputData = "C:\\inputData.txt";
		
		ReadFile rf = new ReadFile(); 
		rf.readFile(inputData);
		rf.printSchedule();
	

	}
}
