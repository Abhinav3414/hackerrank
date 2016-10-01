package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Having TLE 

public class ArrayAndSimpleQueries {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
	
		int k=scan.nextInt();
		
		List < Integer> st = new ArrayList<Integer>();
		List < Integer> stFinal = new ArrayList<Integer>();
	
		int a[]= new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i]=scan.nextInt();
			st.add(a[i]);
		}
		
		List < Integer> sub = new ArrayList<Integer>();
		
		for(int i=0;i<k;i++)
		{
			stFinal.clear();
			 sub.clear();
			int query=scan.nextInt();
			int iIndex=scan.nextInt();
			int jIndex=scan.nextInt();
			
			
			for(int z=iIndex-1;z<jIndex;z++)
			{
				sub.add(st.get(z));
			}
			
			if(query==1)
			{	
				stFinal.addAll(sub);
				
				for(int x=0;x<iIndex-1;x++)
					stFinal.add(st.get(x));
				
				for(int x=jIndex;x<st.size();x++)
					stFinal.add(st.get(x));	
			}
			else
			{
				for(int x=0;x<iIndex-1;x++)
					stFinal.add(st.get(x));
				
				for(int x=jIndex;x<st.size();x++)
					stFinal.add(st.get(x));
				
				stFinal.addAll(sub);			
			}

			st.clear();
			st.addAll(stFinal);	
		}
		
		int diff= stFinal.get(0)-stFinal.get(stFinal.size()-1);		
		System.out.println(Math.abs(diff));
	
		for (Integer integer : stFinal) {
			System.out.print(integer+" ");
		}
			
		
	}

}
