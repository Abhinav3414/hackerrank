package datastructure;

import java.util.Scanner;

public class LeftRotation {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int d=scan.nextInt();
		int a[]= new int [n];
		int lr=d%n;
		
		for (int i = 0; i < a.length; i++)
			a[i]=scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			if(lr==n)
				lr=0;
			System.out.print(a[lr]+" ");
			lr++;
		}
				
		
	}
}