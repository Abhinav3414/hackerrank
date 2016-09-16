/**
 * 
 */
package algorithm;

import java.util.Scanner;

/**
 * @author Abhi
 *
 */

public class Fractions {
	
	public static int GCD(int a, int b) {
		   if (b==0) return a;
		   return GCD(b,a%b);
		}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		int count=0;
		for(int x=1;x<=t;x++)
		{
			for(int y=1;y<=t;y++)
			{
				
				if(x<=y) //condition for factor less than 1
				{
					
					if(x==y) 
					{
						// do nothing
					}
					else if (GCD(x,y)!=1 && x!=1)
					{
						//System.out.println("x : "+x+" y: "+y);
						// do nothing
					}
					else
					{
						System.out.println("x : "+x+" y: "+y);
						count++;
					}
				}

			}
		}
		//System.out.println(GCD(9,18));
		System.out.println(count);
	}

}
