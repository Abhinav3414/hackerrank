package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<t;i++)
		{
			
			String str=scan.nextLine();
			int l=str.length();
			
			if(l%2!=0)
				System.out.println(-1);
			else
			{
				String left=str.substring(0,l/2);
				String right=str.substring(l/2,l);

				Map<String,Integer> lMap= new HashMap<String,Integer>();
				Map<String,Integer> rMap= new HashMap<String,Integer>();

				for (int j = 0; j < left.length(); j++) 
				{
					String lStr=String.valueOf(left.charAt(j));
					String rStr=String.valueOf(right.charAt(j));
					
					if(lMap.containsKey(lStr))
					{
						int val=lMap.get(lStr);	val++;
						lMap.remove(lStr); lMap.put(lStr, val);			
					}
					else
						lMap.put(lStr, 1);	
					
					if(rMap.containsKey(rStr))
					{
						int val=rMap.get(rStr);	val++;
						rMap.remove(rStr); rMap.put(rStr, val);			
					}
					else
						rMap.put(rStr, 1);	
				}

				  
				  for (Entry<String,Integer> entry : lMap.entrySet()) 
				  {
					  String key=entry.getKey();
					  int value= entry.getValue();  
					  
					  if(rMap.containsKey(key))
					  {						  
						  int rValue=rMap.get(key);
						  
						  if(value==rValue)
						  {
							  lMap.put(key,0);
							  rMap.put(key,0);
						  }
						  if(value>rValue)
						  {
							  lMap.put(key,value-rValue);
							  rMap.put(key,0);
						  }
						  if(value<rValue)
						  {
							  lMap.put(key,0);
							  rMap.put(key,rValue-value);
						  } 
					  }			  
				  }

				  int lSum=0;
				  int rSum=0;
				  
				  for (Entry<String,Integer> entry : lMap.entrySet()) 
				  {
					  String key=entry.getKey();
					  int value= entry.getValue();
					  lSum=lSum+value;
				  }
				  
				  for (Entry<String,Integer> entry : rMap.entrySet()) 
				  {
					  String key=entry.getKey();
					  int value= entry.getValue();
					  rSum=rSum+value;
				  }
				  
				 int fin=0;
				 fin =(lSum>=rSum)?lSum:rSum;  
				 System.out.println(fin);  
				  
			}  // else
				
		} // for closes
	
	
	}

}
