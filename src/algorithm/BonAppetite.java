package algorithm;

import java.util.Scanner;

public class BonAppetite {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);

		int a[]= new int[5];
		int b[]= new int[5];
		int c[]= new int[5];
		
		for(int i=0;i<5;i++) 
		{
			a[i]=scan.nextInt();
		}
		for(int j=0;j<5;j++) 
		{
			b[j]=scan.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<5;i++)
		{
			sum=0;
			
			if(a[i]==b[i])			
					sum=0;
			
			else if(a[i]>b[i])
			{
				sum= (((10+b[i])-a[i])>=(a[i]-b[i])) ?a[i]-b[i]:(10+b[i])-a[i];

			}
			else
			{				
				if(((10+a[i])-b[i])>=(b[i]-a[i]))
					sum=b[i]-a[i];
				else
					sum=(10+a[i])-b[i];	
			}
			
			c[i]=sum;
		}

		int finSum=0;
		for(int i=0;i<5;i++) {
			finSum=finSum+c[i];
			
		}
		System.out.print(finSum);
		
	}
}
