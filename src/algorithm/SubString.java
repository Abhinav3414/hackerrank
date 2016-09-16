package algorithm;

import java.util.Scanner;

public class SubString {

	
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int t= scan.nextInt();
		scan.nextLine();
		int ind=0;int sum=0;
		for(int i=0;i<t;i++)
		{
			String str=scan.nextLine();
			
			char charArr[]= str.toCharArray();
			char pCharArr[]= new char[str.length()];
			
			
			for (int j=0;j<str.length()-1;j++) 
			{
				
			}
			
			for (char c : pCharArr) {
				System.out.println(c);
			}
			//System.out.println(sum);
		}
		
	
	}
}
