package datastructure;

import java.util.Scanner;
import java.util.Stack;

class Editor
{
	int op;
	String str;
	
	public Editor()
	{
	}

	public Editor(int op, String str) {
		super();
		this.op = op;
		this.str = str;
	}
	public String toString()
	{
		return ("op "+op +" str: "+str);
	}
	
}

public class SimpleTextEditor {
	
	
	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		Stack<Editor> st= new Stack<Editor>();	
		int index=-1;
		
		
		int n= scan.nextInt();
		
		for (int i = 0; i < n; i++) 
		{
			int op=scan.nextInt();
			
			if(op==1)
			{
				String s=scan.next();
				
				
				if(st.isEmpty())
				{
					StringBuilder string=new StringBuilder("");
					string.append(s);
					st.push(new Editor(op,string.toString()));
				}
				else
				{
					Editor editor= st.peek();
					StringBuilder sBTemp= new StringBuilder(editor.str);
					sBTemp.append(s);
					st.push(new Editor(op,sBTemp.toString()));
				}
				
				
			}
			else if(op==2)
			{
				index=scan.nextInt();
				
				if(!st.isEmpty())
				{
					Editor editor= st.peek();
					String string= editor.str;
					int len=string.length();
					String afterDeleteStr = string.substring(0,len-index);
					st.push(new Editor(op,afterDeleteStr));
				}
			}
			else if(op==3)
			{
				index=scan.nextInt();
				Editor editor= st.peek();
				
				String string= editor.str;
				System.out.println(string.charAt(index-1));
			}
			else if(op==4)
			{
				st.pop();
			}
			

		}
		
	}

}
