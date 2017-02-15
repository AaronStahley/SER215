package assignment_05;

import java.util.Scanner;

public class P2 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		// Variables to store user input
		int id;
		double balance; 
		double annualInterestRate;

		scan = new Scanner(System.in);
		
		System.out.println("Enter the account ID");
		id = scan.nextInt();
		System.out.println("Enter the account balance");
		System.out.print("$");
		balance = scan.nextDouble();
		System.out.println("Enter the annual interest rate");
		System.out.print("%");
		annualInterestRate = scan.nextDouble(); 
		
		// creates new account
		Account account1 = new Account(id, balance, annualInterestRate);
		
		// Asks for withdraw amount
		System.out.println("How much would you like to withdraw");
		System.out.print("$");
		account1.withdraw(scan.nextDouble());
		
		// Asks fot the deposit amount
		System.out.println("How much would you like to deposit");
		System.out.print("$");
		account1.deposit(scan.nextDouble());
		
		System.out.println();
		
		// Prints the account Information. 
		account1.printAccountInfo();
		
		/*
		 *Changed this to a method in Account called printAccountInfo 
		 * 
		System.out.printf("Current balance = $%.2f%n", account1.getBalance());
		System.out.println("Monthly interest rate = " + account1.getMonthlyInterest() + "%");
		System.out.println("Date created = " + account1.getDateCreated());
		*/
		
		
	
	}

}
