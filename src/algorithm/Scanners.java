package algorithm;

import java.util.Scanner;

public class Scanners {

	/*
	 
public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}
	 */
	
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter num");
		int n=0;
		n=scann.nextInt();
		System.out.println("n is : "+n);
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scann.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("a "+a[i]);
		}
		
		
		
	}
}
