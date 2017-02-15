package assignment_04;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Mean_SD_Calculations {
	
	private ReadFile rf;
	private double sum; 
	private double variance;
	private double standardDeviation; 
	private double mean; 
	private ArrayList<Double> list;
	private DecimalFormat df;
	
	
	public Mean_SD_Calculations(){
		
		sum = 0.0; 
		variance = 0.0; 
		rf = new ReadFile();
		list = new ArrayList<Double>();
		df= new DecimalFormat("#.00");
	}

	public Mean_SD_Calculations(String file) throws FileNotFoundException{
		
		sum = 0.0; 
		variance = 0.0; 
		rf = new ReadFile();
		list = new ArrayList<Double>();
		df= new DecimalFormat("#.00");
		
		rf.readData(file);
		list.addAll(rf.getData()); 
		
	}
	
	public void setFile(String file) throws FileNotFoundException{
		 rf.readData(file);
		 list.addAll(rf.getData());
	}
	
	
	// calculates the mean based on the data set. 
	public void calulateMean(){
		
		
		for(int i = 0; i < list.size(); i++){
			
			sum = sum + list.get(i);
			
		}
		mean = sum / list.size(); 
		
	}
	
	public void calculateSD(){
		
		for(int i = 0; i < list.size(); i++){
			
			variance = variance + Math.pow((list.get(i) - mean),2);
		}
		standardDeviation = Math.sqrt((variance)/(list.size()-1));
		
	}
	
	public double getSD(){
		return standardDeviation; 
	}
	
	//returns the mean of the data set. 
	public double getMean(){
		return mean; 
	}
	
	//returns the data set in the file in an array list. 
	public ArrayList getList(){
		return list; 
	}
	
	// Prints the contents in the array list. 
	public void printList(){
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}
	
	// prints the mean of the given data set. 
	public void printMean(){
		System.out.println("Mean = " + df.format(mean));
	}
	
	public void printSD(){
		System.out.println("Standard Deviation = " + df.format(standardDeviation)); 
	}
	

}
