package assignment_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	
	private Scanner scan;  
	private ArrayList<Double> list;
	
	public ReadFile(){
		list = new ArrayList<Double>(); 
	}
	
	
	public void readData(String file) throws FileNotFoundException{
		
		scan = new Scanner(new File(file));
	
		// reads the file until no more integers assuming file is formated correctly. 
		while(scan.hasNextLine()){
			list.add(scan.nextDouble());  // stores the values of the read file into a list.
		}
	}
	
	public ArrayList getData(){
	
		return list; // returns the content of the list to be able to pass it to other lists. 
		
	}
	
	// prints the list that was created by reading the data set in the file. 
	public void printData(){
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
