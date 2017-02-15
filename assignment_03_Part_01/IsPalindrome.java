/*
 * Aaron Stahley
 * 9/14/2016
 * SER215
 */

package assignment_03_Part_01;

import java.util.ArrayList;

public class IsPalindrome {
	
	IsPrime primesInt;
	private String[] primeString; 
	private String[] reversePrime; 
	private ArrayList<String> palindromesList = new ArrayList<String>();
	
	IsPalindrome(){
		
		primesInt = new IsPrime();	
	}
	
	public void createPalindromes(int size){
		
		int newsize = (size * 100); // generates enough primes to get the number of palindromes. 
		
		reversePrime = new String[newsize];
		primeString = new String[newsize]; 
		primesInt.generatePrimes(newsize);
	

		// converts the int array to a string array. 
		for(int i = 0; i < newsize; i++){
			
			int ii; // creates a variable to store the address of primes array. 
			
			ii = primesInt.getAddress(i); // Sets ii to address of primes array
			primeString[i] =  Integer.toString(ii); // puts all the integers into a string array. 
		}
		
		// reverses the string and compares it to the original. 
		for(int i = 0; i < primeString.length; i++){
	
		// Iterates through the primeString array then reverse it and stores it into reversePrime array
			
		reversePrime[i] = new StringBuilder(primeString[i]).reverse().toString();
		}
		
		
		for(int i = 0; i < newsize; i++){
			
			// compares the original string to the string reversed if they are equal than
			// stores it into a list called palindromesList. 
			
			if(primeString[i].compareTo(reversePrime[i]) == 0){
				
				if(palindromesList.size() != size){
				String next; 
				next = primeString[i];
				palindromesList.add(next);
				}
			}
		}
		
	}

	
	public void printPalindromes(){
			
		int count = 0; 
		for(int i = 0; i < palindromesList.size(); i++){
			
		// iterates through the plaindromes list to pull out each address individually. 
			
			// formats based on how many digits are in the string
			if(palindromesList.get(i).length() == 1){
				System.out.print("     " + palindromesList.get(i));
			}else if(palindromesList.get(i).length() == 2){
				System.out.print("    " + palindromesList.get(i));
			}else if(palindromesList.get(i).length() == 3){
				System.out.print("   " + palindromesList.get(i));
			}else{
				System.out.print(" " + palindromesList.get(i));
			}
				
			count++;//updates counts until it reaches 10 then moves down a line. 
			if(count == 10){
				System.out.println();
				System.out.println();

				count = 0; // resets the count to 0 so another 10 can be read. 
			}
		}
		
	}
	
}

