/*
 * Aaron Stahley
 * 9/14/2016
 * SER215
 */

package assignment_03_Part_01;

public class IsPrime {
	
	private int[] primes;
	
	IsPrime(){

	}
	
	public void generatePrimes(int size){
		
		primes = new int[size]; // Instantiates the primes array. 
		
		int count = 0;
		int count2 = 0;
		for(int i = 2; count < size; i++){
			
			boolean isPrime = true; 
			
			for(int j = 2; j < i; j++){
				
				if(i % j == 0){
					isPrime = false; 
					break; // if is prime will break loop and add number to primes array. 
				}
			}
			if(isPrime){
				count++; // Increments so that it generates num amount of primes
						// not just up to that number.
				
				primes[count2] = i; 
				count2++; 
				//System.out.println(primes[count2]);
				
			}
		}
	}
	
	public int getLength(){
		
		int len = 0; 
		len = primes.length;
		return len; 
	}
	public int getAddress(int address){
		address = primes[address];
		return address;
	}
	
	public void displayPrimes(){
		for(int i = 0; i < primes.length; i++){
			System.out.println(primes[i]);// prints the prime array. 
		}
	}

}
