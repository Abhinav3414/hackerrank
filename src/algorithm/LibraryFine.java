package algorithm;

import java.util.Scanner;

public class LibraryFine {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int returnedDD =scan.nextInt();
		int returnedMM =scan.nextInt();
		int returnedYY =scan.nextInt();
		
		int expectedDD =scan.nextInt();
		int expectedMM =scan.nextInt();
		int expectedYY =scan.nextInt();
		
		int fine=0;
		
		if(returnedDD<=expectedDD && returnedMM<=expectedMM && returnedYY<=expectedYY)
			fine=0;
		
		else if(returnedDD>expectedDD && returnedMM==expectedMM && returnedYY==expectedYY)
		fine=15 * (returnedDD-expectedDD);
		
		else if(returnedMM>expectedMM && returnedYY==expectedYY)
		{
			fine=500*(returnedMM- expectedMM);
		}
		else if(returnedYY>expectedYY)
		{
			fine=10000;
		}
		
		System.out.println(fine);
		
	}
}