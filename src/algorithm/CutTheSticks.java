package algorithm;

import java.util.Scanner;

public class CutTheSticks {
	
	public static int getMin(int [] a)
	{
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i] && a[i]!=0)
				min=a[i];
		}
		return min;
	}
	
	public static int getMax(int [] a)
	{
		int max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);	
	int t=scan.nextInt();
	int a[]= new int[t];

	for(int i=0;i<t;i++)
		a[i]=scan.nextInt();

	while(getMax(a)!=0)
	{
		int min=getMin(a);
//		/System.out.println("min"+min);
		int count=0;
	for(int i=0;i<t;i++)
		{	
			
			if(a[i]==0);
			else
			{
					a[i]=a[i]-min;
					count++;
			}
		}
	System.out.println(count);	
	}
	
		
	}
}
