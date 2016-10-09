package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		Map<Integer,Integer> socks= new HashMap<Integer, Integer>();	
		
		for (int i = 0; i <t; i++) 
		{
			int n= scan.nextInt();
			
			if(socks.containsKey(n))
			{
				int val= socks.get(n);
				val++;
				socks.remove(n);
				socks.put(n, val);
			}
			else
				socks.put(n,1);
		}

		int count=0;
		
		for (Entry<Integer, Integer> map : socks.entrySet()) {
				count=count+(map.getValue()/2);
			}

		System.out.println(count);
		
		
	}
}
 