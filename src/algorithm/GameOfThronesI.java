package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class GameOfThronesI {
	

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		String str=scan.nextLine();
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		for (int j = 0; j < str.length(); j++) 
		{
			String strChar=String.valueOf(str.charAt(j));
			
			if(map.containsKey(strChar))
			{
				int val=map.get(strChar);	val++;
				map.remove(strChar); map.put(strChar, val);			
			}
			else
				map.put(strChar, 1);	
		}
		
		int oneCount=0;
		int flag=0;
		
		 for (Entry<String,Integer> entry : map.entrySet()) 
		  {
			  String key=entry.getKey();
			  int value= entry.getValue();  
			  
			  if(value==1)
			  {
				  oneCount++;
				  if(oneCount>1)
				  {
					  System.out.println("NO");
					  flag=1;
					  break;
				  }
			  }
		
		  }
		 
		 if(flag==0)
			 System.out.println("YES");
		 else
			 System.out.println("NO");
		
	//	System.out.println(map);

		
		
		
	}

}
