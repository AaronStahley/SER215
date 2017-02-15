/*
 * Aaron Stahley
 * 9/14/2016
 * SER215
 */

package assignment_03_Part_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFile {
	
	private int rows;
 	int newCol = 2; 
	private int columns;
	private String[][] Schedule;
	private ArrayList<Integer> sumsList = new ArrayList<Integer>();
	private ArrayList<String> unSortedScheduleList = new ArrayList<String>();
	private ArrayList<String> sortedScheduleList = new ArrayList<String>();
	
	public void readFile(String file) throws FileNotFoundException{
		
		
		Scanner scan = new Scanner (new File(file));
	
		String row = scan.nextLine(); // reads the row length
		String col = scan.nextLine(); // reads the column length
		rows = Integer.parseInt(row); // converts string to int
		columns = Integer.parseInt(col) + 1; // needed to add 1 to since it starts at 0
		
		Schedule = new String[rows][columns]; // sets the size of the 2D array. 
		

		//Reads the data from the file and stores it into the 2D array. 
		for(int i = 0; i < rows; i++)
		{
		    for(int j = 0; j < columns; j++)
		    {
		        if(scan.hasNext())
		        {
		            Schedule[i][j] = scan.next();
		          
		        }
		    }
		}
		
		scan.close(); // closes the file
	}
	
	public void addHours(){
	
		 for(int i = 0; i < Schedule.length; i++)
		   {
		  	  int sum = 0; 
		  	  
		      for(int j = 1; j < Schedule[0].length; j++) // j starts at 1 because i dont want the names in the array just numbers. 
		      {
		    
		    	 sum += Integer.parseInt(Schedule[i][j]); // adds together row - 4 column by column
		    	  
		      }
		      
		      sumsList.add(sum);// adds the number to a array list. 
		   }
		 
		 	int total; 

		 	for(int ii = 0; ii < Schedule.length; ii++ ){
		 		
		 		total = sumsList.get(ii);
		 		
		 		// adds the total hours to the employees name in a Arraylist. 
		 		unSortedScheduleList.add(total + " worked " + Schedule[ii][0]); 
		 				 		
		 	}
	
	}
	
	public void sortArray(){
		
		Collections.sort(unSortedScheduleList); // Sorts the hours from smallest to greatest
		Collections.reverse(unSortedScheduleList); // Reverse the list so its greatest to least
		
		String str; 
		
		// this for loop reverses the string by words.
		for(int i = 0; i < unSortedScheduleList.size(); i++){
			
			str = unSortedScheduleList.get(i);
		
			StringBuilder strBuilder = new StringBuilder();
		    String[] words = str.split(" "); 

		    for (int j = words.length-1; j >= 0; j--) {
		        strBuilder.append(words[j]).append(' ');
		    }
		  
		
		    // adds the reversed string to the final list. 
		    sortedScheduleList.add(strBuilder.toString() + "hours");

	}	
	}
		      
	public void printArray(){
		 
		// iterates through sortedScheduleList and prints it out. 
		 for(int i = 0; i < sortedScheduleList.size(); i++){
			 System.out.println(sortedScheduleList.get(i));
		 }
		 
	}
	
}

