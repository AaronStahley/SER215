package assignment_05;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Account {
	
	// Variables. 
	private int id;
	private double balance;
	private static double annualInterestRate;
	private static double monthlyInterestRate; 
	private DateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mma");; 
	private Calendar calendar; 
	private String dateCreated; 
    DecimalFormat format = new DecimalFormat("#0.00");

	
	// No args constructor. 
	public Account(){
		
		// gets the date the account was created based on the PC date. 
		calendar = Calendar.getInstance(); 
		dateCreated = df.format(calendar.getTime()); 
		
		// Sets all private variables to 0; 
		id = 0;
		balance = 0;
		annualInterestRate = 0; 
	}
	
	// Args constructor. 
	public Account(int id, double balance, double annualInterestRate){
		
		// gets the date the account was created based on the PC date
		calendar = Calendar.getInstance(); 
		dateCreated = df.format(calendar.getTime());
		
		// Sets all private variables to the ones that are passed by the method creation
		// In the test class. 
		this.id = id; 
		this.balance = balance; 
		Account.annualInterestRate = annualInterestRate;
		
	}
	
	public void setID(int id){
		// Sets the private variable ID to the one being passed by SetID
		this.id = id; 
	}
	
	public void setBalance(double balance){
		// Sets the private variable setBalance to the one being passed by setBalance
		 balance = this.balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		// Sets the private variable setAnnualInterestRate to the one being passed by setAnnualInterestRate
		Account.annualInterestRate = annualInterestRate; 
	}
	
	public int getID(){
		// returns the private variable id
		return id; 
	}
	
	public double getBalance(){
		// returns the private variable balance
		return balance;
	}
	
	public double getAnnualInterestRate(){
		// returns the private variable getAnnualInterestRate
		return annualInterestRate;
	}
	
	public String getDateCreated(){
		// returns the private variable dateCreated
		return dateCreated;
	}
	
	public static double getMonthlyInterest(){
		// Calculates the monthly interest rate by dividing the annual 
		// interest rate by 1.
		monthlyInterestRate = (annualInterestRate/12);
		return monthlyInterestRate;
	}
	
	public void withdraw(double amount){
		// Calculates the balance after withdraw by subtracting the amount
		// by the balance.
		balance = balance - amount; 
	}
	
	public void deposit(double amount){
		// Calculates the balance after deposit by adding the amount
		//the balance. 
		balance = balance + amount; 
	}
	
	public void printAccountInfo(){
		// Prints out the useful info for the account. 
		System.out.printf("Current balance = $%.2f%n", balance);
		System.out.println("Monthly interest rate = " + format.format(Account.getMonthlyInterest()) + "%");
		System.out.println("Date created = " + dateCreated);
	}

}
