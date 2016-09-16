package algorithm;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited 
{
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t =scan.nextInt();
		int j=scan.nextInt();
		int e=100;
		
		int n[]= new int[t];
		
		for(int i=0;i<t;i++)
			n[i]=scan.nextInt();
		
		int jump=0;
		int i=j;	
		if(i==j)
	{i=0; }
		do{
		//	System.out.println(i);
			if(n[i]==1)
				e=e-3;
			else
				e=e-1;
			
			i=i+j;
			
			if(i>=t)
				i=i%t;
	//		System.out.println("hi");
		}while(i!=0);
	
		System.out.println(e);
		if(i==j && n[0]==1)
			e=e+3;
		if(i==j && n[0]==0)
			e=e+1;
		
		/*if(n[0]==1)
			System.out.println(e-3);
		else
		System.out.println(e-1);*/
		
	}

}

/*
8 2
0 0 1 0 0 1 1 0

19 19
1 1 0 1 0 1 0 1 0 1 0 1 1 0 1 1 1 1 1
*/
