package algorithm;

import java.util.Scanner;

public class TaumAndBday {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			long b=scan.nextLong();
			long w=scan.nextLong();
			long x=scan.nextLong();
			long y=scan.nextLong();
			long z=scan.nextLong();
			long cost=0;
			
			if(z>=x && z>=y)
				cost=(b*x)+(w*y);
			
			else if(z<=x && z<=y)
			{
				long xDiff=x-z;
				long yDiff=y-z;
				
				if(xDiff>yDiff && y+z<x)
				{
						cost=(w*y)+(b*(y+z));
				}
				
				else if(xDiff<yDiff && x+z<y)
				{
					cost=(b*x)+(w*(x+z));
				}
				else
				{
					cost=(w*y)+(b*(x));
				}
				
			}
			else if(x==y)
			{
				cost=(b*x)+(w*y);
			}
			else if(z>=x && z<y)
			{
				if(x+z<y)
					cost=b*x+(w*(x+z));
				else
					cost=(b*x)+(w*y);
			}
			else if(z>=y && z<x)
			{
				if(y+z<x)
					cost=w*y+(b*(y+z));
				else
					cost=(b*x)+(w*y);
			}

			System.out.println(cost);
		}
		
	}

}
