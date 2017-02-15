package assignment_05;

import java.util.Arrays;

public class P1 {
		
	public static String[] split(String s, String regex){
		
		// This creates a string to use for the split method that uses the look ahead and look behind
		// to split the string by the regex but still keeps the regex in another array address.
		final String REG = "(?<=" + regex + ")|(?=" + regex + ")";

			
		String[] sArray = s.split(REG);	// splits the string by the regex which is the look ahead and look behind
		
		// returns the array. 
		return sArray;
		
	}

	public static void main(String[] args) {
		
		// Delimiter is a single character #
		String[] s1 = split("ab#12#453","#");
		
		for(int i = 0; i < s1.length; i++){
			System.out.print(s1[i] + ", ");
		}
		
		System.out.println();
		
		// Delimiter is ? and # separate denoted by the brackets []
		String[] s2 = split("a?b?gf#e","[?#]");
		
		for(int i = 0; i < s2.length; i++){
			System.out.print(s2[i] + ", ");
		}
		
		System.out.println();
		
		
		// Delimiter is only the combination of /# 
		String[] s3 = split("a/#b?gf#e/","/#");
		
		for(int i = 0; i < s3.length; i++){
			System.out.print(s3[i] + ", ");
		}
		
		System.out.println();
		
		// Delimiter is an empty space. 
		String[] s4 = split("ab/cd ef#ghi"," ");
		
		for(int i = 0; i < s4.length; i++){
			System.out.print(s4[i] + ", ");
		}
		
		
//		 This is the same strings an delimiters just in an array not in string form. 
		
//		System.out.println(Arrays.toString(split("ab#12#453","#")));
//		System.out.println(Arrays.toString(split("a?b?gf#e","[?#]")));
//		System.out.println(Arrays.toString(split("a/#b?gf#e/","/#")));
//		System.out.println(Arrays.toString(split("ab/cd ef#ghi"," ")));

		
			
		
	
		
		

	}

}
