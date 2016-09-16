package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RichieRich {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		int k= scan.nextInt();
		scan.nextLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
		for(int i=0;i<n;i++)
		{
			//String str = br.readLine();
			String str= scan.next();
			int midStr=str.length()/2;
			
			String l=str.substring(0,midStr);
			String r=null;
			
			char mid=str.charAt(str.length()/2);
			String midStrChar=String.valueOf(mid);
			
			if(str.length()%2==0)
				r=str.substring(midStr,str.length());
			else
				r=str.substring(midStr+1,str.length());
			
			char lCharArr[]= l.toCharArray();
			char rCharArr[]=r.toCharArray();
			
			i=0;
			int j=r.length()-1;
			while(i<=j)
			{
				char temp=rCharArr[i];
				rCharArr[i]=rCharArr[j];
				rCharArr[j]=temp;
				i++;
				j--;
			}
			
		/*	System.out.println("l "+l);
			for (char c : rCharArr) {
				System.out.print(c);
			}*/
		
			
			int count=0;
			int alterCount=0;
			for(int a=0;a<l.length();a++)
				if(lCharArr[a]!=rCharArr[a])
					count++;
		//	System.out.println();
	//		System.out.println("count "+count);
			alterCount=k-count;
			if(count>k)
				System.out.println(-1);
			else
			{
				
				if((str.length()==1)&&k>=1)
					System.out.println("9");
				else if((str.length()==1)&&k==1)
					System.out.println(str);
				//inside else	
				else
				{
				
				
				
				for(int b=0;b<l.length();b++)
				{
					if(lCharArr[b]>rCharArr[b])
					{
						rCharArr[b]=lCharArr[b];
						count--;
					}
					else if(lCharArr[b]<rCharArr[b])
					{
						lCharArr[b]=rCharArr[b];
						count--;
					}
					else
					{
						
					}
				}
				
				
				if(count==0 && k==1)
				{
					midStrChar="9";
					alterCount=alterCount-1;

				}
				
				
				
				
				int b=0;
			//	System.out.println("alterCount "+alterCount);
				while(alterCount>0)
				{
				//	System.out.println("b "+b);
					if(b==l.length())
						break;
					
					lCharArr[b]='9';
					rCharArr[b]='9';
					b++;
					alterCount--;
					alterCount--;
				}
				
			/*	System.out.println("final count "+count);
				for (char c : lCharArr) {
					System.out.print(c);
				}
				System.out.println();
				for (char c : rCharArr) {
					System.out.print(c);
				}
			*/	
				String left= String.valueOf(lCharArr);
				
				// again reverese r char array		
				i=0;
				j=r.length()-1;
				while(i<=j)
				{
					char temp=rCharArr[i];
					rCharArr[i]=rCharArr[j];
					rCharArr[j]=temp;
					i++;
					j--;
				}		
				
				String right= String.valueOf(rCharArr);				
				String finalStr=null;
				
				if(n%2==0)
					finalStr=left.concat(right);
				else
					finalStr=left.concat(midStrChar.concat(right));
				
				System.out.println(finalStr);
			
				} // inside else
				
			}  // else closes
 			
			
			
		}
	}

}
