package algorithm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner scan= new Scanner(System.in);
	        
	        String str= scan.next();
	        
	       
	        int l = str.length();
	        char a[]=str.toCharArray();
	        
	         List<String> list = new ArrayList<String>();
	        
	       for(int i=0;i<l;i++)
	        {
	    	   String z=Character.toString(a[i]);
	             list.add(z);
	        }
	        
	        Iterator<String> iter = list.iterator();
	        
	     
	    
	        for(int i=0;i<l-1;i++)
	        {
	        	String t1=list.get(i);
	        	String t2=list.get(i+1);
	        //	System.out.println("  i "+i);
	        	//System.out.print("  t1 "+t1);
	        	//System.out.print("  t2 "+t2);
	        	  if(t1.equals(t2))
	        	  { //System.out.println("yes ");
	        		//  list.remove(i);
	        	  list.set(i, "@");
	        	  list.set(i+1, "@");
	        		 // list.remove(i+1);
	        		  i=i+1;
	          	  }
	        	  else
	        	  { //System.out.println("no ");
	        		 
	        	  }
	        	
	        }
	        
	    //    while(iter.hasNext())
	      //       System.out.print(iter.next());
	        
	        for(int i=0;i<l-1;i++)
	        {
	        	String t1=list.get(i);
	       
	        	  if(t1.equals("@"))
	        	  { 
	        		 
	        		  //list.remove(i);
	          	  }
	        	  else
	        	  {
	        		  System.out.print(list.get(i));
	        	  }
	        	
	        }
	        
	    //    while(iter.hasNext())
	      //       System.out.print(iter.next());
	      /* for(int i=0;i<l-1;i++)
	            {
	           if(a[i]==a[i+1])
	             {
	                a[i]='@';
	                a[i+1]='@';
	                i++;
	            }
	        }
	   //   System.out.print(a);
	        int count=0;
	          for(int i=0;i<l;i++)
	            {
	              if(a[i]=='@')
	                  count ++;
	          }
	        
	        if(count==l)
	            System.out.println("Empty String");
	        else
	        {
	           for(int i=0;i<l;i++)
	          	{
	            if(a[i]=='@')
	                {
	                
	            }
	              else
	                  System.out.print(a[i]);
	       		}
	            
	        }
	        */
	        
	    }
}