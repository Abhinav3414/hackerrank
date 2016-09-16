package algorithm;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		
		
		
		Scanner scan= new Scanner(System.in);		
		String str= scan.next();
		int n=scan.nextInt();
		System.out.printf( "%-15s %03d %n", str,n);
		
		
		
	}
}
