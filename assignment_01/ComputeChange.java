/* 
 * Aaron Stahley
 * computeChange.java
 * 8/31/2016
 * SER 215
 */

package assignment_01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeChange {
	
	
	private static Scanner scan2;
	
	private static boolean isDouble(String str) { 
		
		// checks if the string is a double 
	    try {
	    	// This try block will fail if value is anything other than a double. 
	    	
	    	// handles if the number is negative. 
	    	if(Double.parseDouble(str) < 0){
	    		
	    		return false; // if a negative number than return false
	    	}
	    	
	        Double.parseDouble(str); 
	        
	        return true; // if double than return true
	        
	    } catch(NumberFormatException e) {
	    	// throws and exception for anything that is not a double such as a string. 
	        return false; // the input was not a double. 
	    }
	}
	
	public static String getInput(Scanner scan, String script) {
		
	    System.out.println(script); // asks the user to enter a double   
	    String text = ""; 
	    
	    while (true) { // if input is not a double it will keep looping until one is entered
	        text = scan.nextLine(); 
	        if(isDouble(text)) // uses the isDouble method to check if input is a double
	            break; 
	        
	        System.out.println("Try again " + script);
	    } 
	    return text; 
	}

	public static double roundDown(double numValue){
		
		int sigFig = 2; 
		
		if(numValue > 0){
			// 
		 return new BigDecimal(String.valueOf(numValue)).setScale(sigFig, BigDecimal.ROUND_FLOOR).doubleValue();
		}else{
			return new BigDecimal(String.valueOf(numValue)).setScale(sigFig, BigDecimal.ROUND_CEILING).doubleValue(); 
		}	
	}
	
	public static void main(String[] args) {
		
		double value; 
		double remainder = 0;
		
		String ans;
			
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0; 
		int pennies = 0;
		
		int dollarValue = 1;
		double quarterValue = 0.25;
		double dimeValue = 0.10;
		double nickelValue = 0.05;
		double pennyValue = 0.01;
		
		
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.HALF_UP);
	
		// needed to create a second scanner because bug was introduced when creating the get input method. 
		Scanner scan = new Scanner(System.in);
		scan2 = new Scanner(System.in);  
		
		System.out.println("Welcome To Change Calculator");
	
		// do this until told not to. by anything other than Y or y when bottom of code is reached. 
		do{
		
		System.out.println();
		
		
		 value = Double.parseDouble(getInput(scan, "Please enter a positive number"));
		
		value = roundDown(value); // limits the user input to only two decimal places. 
		// EX. user input = 2.566666666 when method is ran value = 2.56
		 	
		
// ---------------------------- if statements for dollar amounts ------------// 		
		if(value < 0.01){
			
			// if the value entered is less than a penny all amounts are set to zero. 
			dollars = 0; 
			quarters = 0;
			dimes = 0; 
			nickels = 0; 
			pennies = 0; 
			
		}
		else if(value >= dollarValue){
			
			/* number of dollars is calculated by dividing the total value by a single dollar
		 	then subtracts the remainder from that, giving you the total amount of dollars. 
			the remainder is what is used as the new value which is then used to calculate the coin
			values in the upcoming if statements. This same logic is used for every coin value 
			as well */  
			
			remainder = value%dollarValue; 
			dollars = (int) ((value / dollarValue)-(remainder));
			
		}else{
			
			/* if the value entered by the user is less than 1.00 such as just a change value
			the dollar amount will become zero and the if and else if statements wont execute. */
			
			dollars = 0; 
		}
// --------------------------- end of dollar amount statements -----------------//		

		
// ---------------------------- if statements for quarter amounts ------------// 		
		
		if(dollars == 0){
					
			remainder = value%quarterValue; 
			quarters = (int) ((value / quarterValue) - (remainder));
			
		}
		else if(remainder >= quarterValue){
			
			quarters = (int) (remainder/quarterValue); 
			remainder = remainder%quarterValue;
			
		}else{
			
			quarters = 0; 
		}
// --------------------------- end of quarter amount statements -----------------//		

		
// ---------------------------- if statements for dime amounts ------------// 		
		
		if(quarters == 0 && dollars == 0){
			
			remainder = value%dimeValue; 
			dimes = (int) ((value / dimeValue) - (remainder));  
			
		}	
		else if(remainder >= dimeValue){
				
			dimes = (int) (remainder/dimeValue); 
			remainder = remainder%dimeValue;


		}else{
			
			dimes = 0; 
		}
// --------------------------- end of dime amount statements -----------------//		

		
// ---------------------------- if statements for nickel amounts ------------// 		
		
		if(quarters == 0 && dollars == 0 && dimes == 0){
			
			remainder = value%nickelValue; 
			nickels = (int) ((value / nickelValue) - (remainder)); 
		
		}
		else if(remainder >= nickelValue){
							
			nickels = (int) (remainder/nickelValue); 
			remainder = remainder%nickelValue;
	
		}else{
			
			nickels = 0; 
			
		}
// --------------------------- end of nickel amount statements -----------------//	
		
		
		// needed this to correct for rounding error 
		
		if(remainder >= .00911111){
		String r = Double.toString(remainder);
		
		r = df.format(remainder);
		remainder = Double.parseDouble(r);
		}
		
		//---------------------------------------//
		
		
// ---------------------------- if statements for penny amounts ------------// 		
		if(quarters == 0 && dollars == 0 && dimes == 0 && nickels == 0){
			
			remainder = value%pennyValue;
			pennies = (int) ((value / pennyValue) - (remainder)); 
			
		}
		else if(remainder >= pennyValue){
			
			pennies = (int) (remainder/pennyValue); 
			remainder = remainder%pennyValue;
			 
		}else{
			
			pennies = 0; 
			
		}
// --------------------------- end of penny amount statements -----------------//		

		
// --------------------------- output Data ------------------------------------//
		System.out.println();
		
		// format for output of change. 
		System.out.println("Dollars = " + dollars + ", Quarters = " + quarters 
				+ ", Dimes = " + dimes + ", Nickles = " + nickels + ", Pennies = " + pennies);
		
		System.out.println();
		
		// Prompts the user to run the program again. any value other than y or Y will terminate. 
		System.out.println("Would you like to enter another value? (y/n)");
		ans = scan2.next(); 
		
		}
		// If user enters anything other than Y or y the program will exit
		while(ans.equals("y") || ans.equals("Y"));
		
		// ends the program. 
		System.out.println("Exciting program...");
		
		
		

	}

}
