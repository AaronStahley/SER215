package assignment_03_attempt_01_Failed;

public class OddArray {
	
	private int size;
	private int[] odds;  
		
	OddArray(int size){
		
		odds = new int[size];
	}
	
	public void fillArray(){
	
		int k = 0;
		
		for(int i = 0; i<odds.length; i++){
		
			odds[i] = (2*k)+1; // any number multiplied by 2 than add 1 is odd. 
			k++; // Increments k so that the array will have every odd number.
				
			}
	}

	public void displayOut() {
		
		// displays the array used for testing purposes. 
		for(int i = 0; i < odds.length; i++){
			
			System.out.println(odds[i]);
			
		}
		
	}
	
	public int getLength(){
		
		// returns the length of the array. 
		int len = 0; 
		len = odds.length; 
		return len; 
		
	}
	
	public int getAdress(int address){
		
		address = odds[address];
		
		return address; 
	}

}
