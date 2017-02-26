package algorithm;

import java.util.Scanner;

public class SumVsXOR {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		int count =0;
		
		for(int i=0;i<n;i++)
		{
			if((n+i)==(n^i))
				count++;
		}
		
		System.out.println(count);
		
	}

}
