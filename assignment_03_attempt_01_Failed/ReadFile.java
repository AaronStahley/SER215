package assignment_03_attempt_01_Failed;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	
	String[][] schedule; // creates a 2D array.
	ArrayList<String> sortedArray;
	
	public void ReadFile(){
	
	}
	
	public void readFile(String fileName) throws FileNotFoundException  {
			
		Scanner s = new Scanner(new File(fileName)); // Reads the files from destination
		ArrayList<String> list = new ArrayList<String>(); // creates a new Array list
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> sumHours = new ArrayList<Integer>();
		ArrayList<String> empNames = new ArrayList<String>();
		sortedArray = new ArrayList<String>();

		
			// reads in the file into a array list. 
			 while(s.hasNextLine()) {
	               
				 list.add(s.nextLine()); 
			 }
			 
			 s.close();
			 
			
			 //System.out.println(list);
			 
			 String row = list.get(0);
			 String col = list.get(1);
			
			// System.out.println(list.get(0) + list.get(1));
			 
			 /*
			 schedule = new String[Integer.parseInt(row)][]; // Instantiates a new 2D array
			 schedule[0] = new String[Integer.parseInt(row)]; // sets the row length
			 schedule[1] = new String[Integer.parseInt(col)]; // sets the col length.
			 */
			 list.remove(0);
			 list.remove(0);
			 
			 //System.out.println(list);
						 
			// System.out.println(schedule[0].length);
			// System.out.println(schedule[1].length);
			 
			 String employeeName; 
			 for(int i = 0; i < list.size(); i++){
				 employeeName = list.get(i).toString();
				 employeeName = employeeName.replaceAll("[^A-Za-z]+", "");
				 empNames.add(employeeName);
				 //System.out.println(empNames.get(i));
			 }
			
			 
			 for(int i = 0; i < list.size(); i++){
				 
				 String st = list.get(i);
				 int length = st.length();
				 String result = "";
		
			    
			    for (int ii = 0; ii < length; ii++) {
			    	
			        Character ch = st.charAt(ii);
			        
			        if (Character.isDigit(ch)) {
			     
			        		result = ch + "";  
			        		list2.add(Integer.parseInt(result));	
			        }  
			        
			    }
			 
			 }
			 
			 
			 // this works just need to do it for the number of names. 
			 int count = 0; 
			 int sum = 0;
			 			 
			 // if count does no equal the number of the employees it will keep doing this. 
			 while(count != Integer.parseInt(row)){
			 for(int i = 0; i < 7; i++) {
				 
					sum += list2.get(i); // sums the first 7 numbers together in list2. 
		
			 } 
			 
			 for(int i = 0; i < 7; i++){
				 list2.remove(0);// deletes the first 7 digits which is the first employee 
				 				// keeps doing this until all rows are complete. 
			 }
			 
			 sumHours.add(sum); // adds the first employee sums of hours to the first list. 
			 sum = 0;  // resets sum to 0 ; 
			 count++; // updates the count after each iteration. 
			 }
			 
			// System.out.println();
			 for(int iiii = 0; iiii < sumHours.size(); iiii++){
				 
				 //System.out.println(sumHours.get(iiii));
				 
			 }
			
			 
			for(int i = 0; i < empNames.size(); i++){
				//System.out.println(empNames.get(i) + " " );
			}
			//System.out.println();
			for(int i = 0; i < empNames.size(); i++){
			sortedArray.add(empNames.get(i) + " Worked " + sumHours.get(i) + " hours");
			//System.out.println(sortedArray.get(i));
			}
			
			
			/*
			String x[] = new String[empNames.size()];
			String z[] = new String[sumHours.size()];
			x = empNames.toArray(x); 
			
			for(int i = 0; i < sumHours.size(); i++){
				String str; 
				str = sumHours.get(i).toString(); 
				z[i] = str; 
			}
			System.out.println();
			String schedule[][] = {x,z}; 
		
			for(int i=0; i<schedule.length; i++)
			{
			    for(int j=0; j<schedule[0].length; j++)
			        System.out.print(schedule[i][j]+ " ");
			    System.out.println();
			}
			*/
			
	}
	
	public void sortSchedule(){
		
	}
	
	public void printSchedule(){
		
		for(int i = 0; i < sortedArray.size(); i++){
			System.out.println(sortedArray.get(i));
		}
		
	}
}
