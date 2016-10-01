package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		
		Map<String,Integer> map= new HashMap<String, Integer>();
		scan.nextLine();
		
		for(int i=0;i<n;i++)
		{
			String str=scan.nextLine();
			if(map.containsKey(str))
			{
				int val=map.get(str);
				++val;
				map.remove(str);
				map.put(str,val);
			}
			else
				map.put(str,1);

		}
		
		int t=scan.nextInt();
		scan.nextLine();
		
		for(int j=0;j<t;j++)
		{
			String str2=scan.nextLine();
			if(map.containsKey(str2))
				System.out.println(map.get(str2));
			else
				System.out.println(0);
		}
	
		
	}
}