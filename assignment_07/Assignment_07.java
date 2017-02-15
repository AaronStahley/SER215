package assignment_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_07 {
	
	private static Scanner scan;

	// calculates the greatest common deviser
	public static int gcd(int a, int b){
		
		if(a == 0 || b == 0){
			return a + b; 
		}else{
			return gcd(b, a%b); 
		}
	}

	public static void main(String[] args) {
		
		int pairs; 
		int counter = 0; 
		
		scan = new Scanner(System.in);
		
		ArrayList<String> pairList = new ArrayList<String>(); // Stores the initial values of the ordered pairs
		ArrayList<Integer> pairListInt = new ArrayList<Integer>();// stores the integer values of the order pairs.
		
		System.out.println("How many pairs of integers will you be needing calculation ?");
		pairs = scan.nextInt(); 
		
		while(counter < pairs){
		
			System.out.print("Enter your first integer in the pair:  ");
			pairList.add(scan.next());
			System.out.print("Enter your second integer in the pair:  ");
			pairList.add(scan.next());
			System.out.println();
			counter++;
			
		}
		
		for(int i = 0; i < pairList.size(); i++){
			
			pairListInt.add(Integer.parseInt(pairList.get(i))); // converts String to integer and puts it in a list
			
		}
		
		for(int i = 0; i < pairListInt.size(); i++){
			
			if(i < pairList.size()){
				int a = pairListInt.get(i); // gets the element i 
				int b = pairListInt.get(i+1); // gets the next element after i
				System.out.println("(" + a + "," + b +")" + "  GCD = " + gcd(a,b));
				i++; // increments by 1 since you first get index 0 and 1 and next you want 2 and 4. 

			}
		
		}	

	}

}
