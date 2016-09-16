package algorithm;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		Set<Integer> set= new TreeSet<Integer>();
		
		for(int i=0;i<t;i++)
		{
			set.clear();
			int n=scan.nextInt();
			int a=scan.nextInt();
			int b=scan.nextInt();
			
			int p=n-1;
			int q=0;
			
			if(a==b)
			{
				int val=(a*p);
				set.add(val);
				
			}
			else
			{
				
			for(int j=0;j<n;j++)
			{
				int val=(a*p)+(b*j);
				set.add(val);
				p--;
			}
		//	System.out.println(set);
			
			

			}
			for (Integer integer : set) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
		
	}

}
