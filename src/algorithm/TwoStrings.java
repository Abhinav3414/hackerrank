package algorithm;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TwoStrings {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		Set<String> set1= new TreeSet<String>();
		Set<String> set2= new TreeSet<String>();
			
		for(int i=0;i<t;i++)
		{
			
			String str1=scan.nextLine();
			String str2=scan.nextLine();
			
			char str1Char[]=str1.toCharArray();
			char str2Char[]=str2.toCharArray();
			
			for (char c : str1Char) {
				set1.add(String.valueOf(c));
			}
			for (char c : str2Char) {
				set2.add(String.valueOf(c));
			}
			
	/*		System.out.println(set1);

			System.out.println(set2);
			*/
			int size1=set1.size();
			set1.removeAll(set2);
			int size2=set1.size();
			
	/*		System.out.println(size1);
			System.out.println(size2);*/
			if(size2<size1)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
	}

}
