package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort1Partition {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		int n=scan.nextInt();
		
		for(int i=0;i<t-1;i++)
		{
			int ch=scan.nextInt();
			
			if(ch<n)
				left.add(ch);
			else
				right.add(ch);
			
		}
		for (Integer integer : left) {
			System.out.print(integer+" ");
		}
		
		System.out.print(n+" ");
		for (Integer integer : right) {
			System.out.print(integer+" ");
		}
		
		
	}
}
