package assignment_04;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class StandardDeviation {
	
	 private Mean_SD_Calculations mean;
	 private final double MEAN; // Stores the mean value
	 private double sum; // Same as the variance
	 private double standardDeviation; 
	 private ArrayList<Double> list = new ArrayList<Double>();
	 private DecimalFormat df = new DecimalFormat("#.00");
	 
	public StandardDeviation() throws FileNotFoundException{
		
		
		mean = new Mean_SD_Calculations();
		mean.calulateMean(); 
		MEAN = mean.getMean(); 
		list.addAll(mean.getList()); //passes the list of values from mean to this list
		System.out.println(mean.getMean());
		 
	 }
	
	public void calculateSD(){
				
		// calculates the standard deviation of the data set in list. 
		for(int i = 0; i < list.size(); i++){
			
			sum = sum + Math.pow((list.get(i) - MEAN),2);
		}
		standardDeviation = Math.sqrt((sum)/(list.size()-1));
		
	}
	
	// prints out the final value of the standard deviation. 
	public void printSD(){
		System.out.println("Standard Deviation = " + df.format(standardDeviation)); 
	}
	 
}
