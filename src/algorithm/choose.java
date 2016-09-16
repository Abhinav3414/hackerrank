package algorithm;

import java.util.Scanner;

public class choose {
	
	static int choose(int n, int k)
	{
    if (k == 0) return 1;
    return (n * choose(n - 1, k - 1)) / k;
	}	
   	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a= in.nextInt();
        int b= in.nextInt();
            
      int arr[]= new int[b-1];
      int len=a;
      
      for(int i=0;i<b-1;i++)
      {    	
    	  arr[i]=choose(a,len);    	
    	  a++;
      }
      for(int i=0;i<b-2;i++)
      {   	  
    	  System.out.print(arr[i]+"+");  	 
      }
      
      System.out.println(arr[b-2]);
      
        }
	
}
