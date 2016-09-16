package algorithm;

import java.util.Scanner;

public class DesignerPDFViewer {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int a[]= new int[26];
		
		for(int i=0;i<26;i++)
			a[i]=scan.nextInt();
		
		
		scan.nextLine();
		
		String str= scan.nextLine();
	
		int x=a[(str.charAt(0)-97)];
		
		for(int i=0;i<str.length();i++)
		{
			if(a[(str.charAt(i)-97)]>x)
			{
				x=a[(str.charAt(i)-97)];
			}
		}

		System.out.println(x*str.length());
	}

}
