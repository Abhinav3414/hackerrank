package algorithm;

import java.util.Scanner;

public class AlternatingCharacters {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		scan.nextLine();
		
		
		for(int i=0;i<t;i++)
		{
			
		String str=scan.nextLine();
		char charArr[]= str.toCharArray();
		
		
		char prev=charArr[0];
		
		for (int j = 1; j < charArr.length; j++) 
		{
			if(charArr[j]==prev)
			{
				charArr[j]='#';
			}
			else
				prev=charArr[j];
			
		}
		int count=0;
		for (char c : charArr) {
			if(c=='#')
			count++;
		}
		System.out.println(count);
		
			}
		
	}

}
