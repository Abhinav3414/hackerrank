package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		
		scan.nextLine();
		
		for(int i=0;i<n;i++)
		{
			String str=scan.nextLine();
			char charArr[]= str.toCharArray();
			
			Stack <String> st= new Stack<String>();
			int flag=0;
			
			for (int j = 0; j < charArr.length; j++) {
				
				if(flag==1)
					break;
				
				if(charArr[j]=='[' || charArr[j]=='('  || charArr[j]=='{' )
				{
					st.push(String.valueOf(charArr[j]));
				}
				if(charArr[j]==']' || charArr[j]==')'  || charArr[j]=='}' )
				{
					if(j==0)
					{
						flag=1;
						break;
					}
					else
					{
						if(st.isEmpty())
						{
							flag=1;
							break;
						}
						String sta= st.peek();
						
						if(charArr[j]==')' && sta.charAt(0)=='(')
							st.pop();
						else if(charArr[j]=='}' && sta.charAt(0)=='{')
							st.pop();
						else if(charArr[j]==']' && sta.charAt(0)=='[')
							st.pop();

						else
						{
							flag=1;
							break;
						}
					}
					
				}
				
			
			}
			
			if(st.isEmpty() && flag!=1)
				System.out.println("YES");
			else
				System.out.println("No");
			
				
		}
		
		
	}
}
