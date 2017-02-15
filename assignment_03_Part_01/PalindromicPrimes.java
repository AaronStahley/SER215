/*
 * Aaron Stahley
 * 9/14/2016
 * SER215
 */

package assignment_03_Part_01;

public class PalindromicPrimes {

	public static void main(String[] args) {
		
		IsPalindrome palindrome = new IsPalindrome();
		palindrome.createPalindromes(20); // enter the number of palindromes you want
		palindrome.printPalindromes();
		

	}

}
