package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
				/*
				System.out.println(left);
				System.out.println(right);*/

				List<String> lList= new ArrayList<String>();
				List<String> rList= new ArrayList<String>();

				for (int j = 0; j < left.length(); j++) 
				{
					String lStr=String.valueOf(left.charAt(j));
					String rStr=String.valueOf(right.charAt(j));
					lList.add(lStr);
					rList.add(rStr);
					
				}
				
				  Collections.sort(lList);
				  Collections.sort(rList);
				  
				  System.out.println(lList);
				  System.out.println(rList);
			 int count=0;
				  
			 int j=0;
				  while(lList!=null) 
				  {
					  if(j==lList.size())
						  break;
					  
					  String lChar=lList.get(j);
					  int p=0;
					 
					  for (String string : rList) {
						if(lChar.equals(string))
						{lList.remove(j);
						rList.remove(p);
						j=0;
						break;
						}
						else
						{
							p++;
						}
					}
					  j++;
				  }

				  if(lList.get(0).equals(rList.get(0)))
					  {
					  	lList.remove(0);
					  	rList.remove(0);
					  }
				  System.out.println(lList);
				  System.out.println(rList);
				  System.out.println(lList.size());
		//		  System.out.println(rList);
					
			}
				
		}
	}

}
