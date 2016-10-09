package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks 
{
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int aArray[]= new int[a];
		int bArray[]= new int[b];
		int cArray[]= new int[c];
		int heightA=0, heightB=0, heightC=0;  
		int i=0;
		for (i = (a-1) ; i >=0; i--)
		{
			aArray[i]=scan.nextInt();
			heightA = heightA+aArray[i];
		}
			
		for (i = (b-1) ; i >=0; i--)
		{
			bArray[i]=scan.nextInt();
			heightB = heightB+bArray[i];
		}
			
	
		for (i = (c-1) ; i >=0; i--)
		{
			cArray[i]=scan.nextInt();
			heightC = heightC+cArray[i];
		}
			
		
		Stack <Integer> stA= new Stack<Integer>();
		Stack <Integer> stB= new Stack<Integer>();
		Stack <Integer> stC= new Stack<Integer>();
		
		for(i=0;i<a;i++)
			stA.push(aArray[i]);
		
		for(i=0;i<b;i++)
			stB.push(bArray[i]);
		
		for(i=0;i<c;i++)
			stC.push(cArray[i]);
		

		
		
		
		
		
	}
}