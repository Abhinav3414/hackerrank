package algorithm;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort {
    
    

    public static void insertIntoSorted(int[] ar) {
        
        int l=ar.length;
        int temp=ar[l-1];
        int flag=0;
        int index=l-2;
      
        for(int i=l-2;i>=0;i--)
            {
            if(ar[i]>temp)
                {
            ar[i+1]=ar[i];    
            }
            else
                {
            //	System.out.println("asaa");
                ar[i+1]=temp;
                flag=1;
                break;
            }
            
        for(int in:ar)
            {
            System.out.print(in+" ");
        }
            System.out.println();
        }
        if(flag==1)
        	{
        	 for(int in:ar)
             {
             System.out.print(in+" ");
         }
             System.out.println();
         }
        else
        {
        	ar[0]=temp;
        	 for(int in:ar)
             {
             System.out.print(in+" ");
         }
             System.out.println();
        }
 
        	
        
        // Fill up this function  
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
