package algorithm;

import java.util.Scanner;

public class SOS {

	public static void main(String[] args) {
		
		
		   Scanner in = new Scanner(System.in);
	        String S = in.next();
	        
	        int l=S.length();
	        int n=l/3;
	        char charSosArr[]= S.toCharArray();
	        
	        int sum=0;
	        for(int i=0;i<l;i=i+3)
	        {
	        	//System.out.println(i);
	        	if(charSosArr[i]!='S')
	        		sum=sum+1;
	        	if(charSosArr[i+1]!='O')
	        		sum=sum+1;	
	        	if(charSosArr[i+2]!='S')
	        		sum=sum+1;
	        	
	        }
	        System.out.println(sum);
	        
	        
	}
}
