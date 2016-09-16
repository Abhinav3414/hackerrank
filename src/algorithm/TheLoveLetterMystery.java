package algorithm;

import java.util.Scanner;

public class TheLoveLetterMystery {
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<t;i++)
		{
			String str=scan.nextLine();
			
			String l=str.substring(0,str.length()/2);
			String r=null;
			
			if(str.length()%2==0)
				r=str.substring(str.length()/2,str.length());
		
			else
				r=str.substring(str.length()/2 +1,str.length());
			
			
			char lCharArr[]=l.toCharArray();
			char rCharArr[]=r.toCharArray();
			
			int mid=r.length()/2;
			for(int j=0,k=r.length()-1;j<mid||k>=mid;j++,k--)
			{
				char temp=rCharArr[j];
				rCharArr[j]=rCharArr[k];
				rCharArr[k]=temp;
			}
			
		/*	System.out.println();
			
			for (char c : rCharArr) {
				System.out.print(c);
			}*/
			int count=0;
			for(int m=0;m<r.length();m++)
			{
				int lInt=lCharArr[m];
				int rInt=rCharArr[m];
				
				if(lInt>rInt)
				{
					lCharArr[m]=rCharArr[m];
					count=count+(lInt-rInt);
				}
				else if(rInt>lInt)
				{
					rCharArr[m]=lCharArr[m];
					count=count+(rInt-lInt);
				}
				else
				{
					
				}
				
			}
			
			/*	System.out.println();
				for (char c : lCharArr) {
					System.out.print(c);
				}
		
				System.out.println();
				
					for (char c : rCharArr) {
						System.out.print(c);
					}*/
				//	System.out.println();
			System.out.println(count);
		}
	}

}
