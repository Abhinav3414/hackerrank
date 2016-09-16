package algorithm;

import java.util.Scanner;

public class JumpingOnTheClouds 
{
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t =scan.nextInt();
		
		int n[]= new int[t];
		
		for(int i=0;i<t;i++)
		{
			n[i]=scan.nextInt();
		}
		
		int jump=0;
		
		for(int i=0;i<t-1;i++)
		{
			//System.out.println(i);
			if(n[i+1]==0 && i+1==t-1)
			{
				jump++;
			}
			else if(n[i+1]==0 && n[i+2]==0)
			{
				i=i+1;
				jump++;
			}
			else if(n[i+1]==0 && n[i+2]==1)
			{
				jump++;
			}
			else if(n[i+1]==1)
			{
				i=i+1;
				jump++;
			}
			else{}
			
		}
		System.out.println(jump);
		
	}

}
