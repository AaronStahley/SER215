package assignment_04;

import java.io.FileNotFoundException;

public class Assignment4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Test file 
		
		Mean_SD_Calculations calculations1 = new Mean_SD_Calculations("C:\\data.txt");
		
		//first data set
		calculations1.calulateMean();
		calculations1.printMean();
		calculations1.calculateSD();
		calculations1.printSD();

		
		System.out.println(); // Creates a space in between outputs
		
		
		Mean_SD_Calculations Calculations2 = new Mean_SD_Calculations("C:\\data2.txt");

		//second data set
		Calculations2.calulateMean();
		Calculations2.printMean();
		Calculations2.calculateSD();
		Calculations2.printSD();
		
		
		System.out.println(); // Creates a space in between outputs
		
		
		Mean_SD_Calculations Calculations3 = new Mean_SD_Calculations("C:\\data3.txt");

		//second data set
		Calculations3.calulateMean();
		Calculations3.printMean();
		Calculations3.calculateSD();
		Calculations3.printSD();
	}

}
