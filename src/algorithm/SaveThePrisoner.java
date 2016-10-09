package algorithm;

import java.util.Scanner;

public class SaveThePrisoner {
	
public static void main(String[] args) {
		
	   Scanner sc=new Scanner(System.in);
	    long t=sc.nextLong();
	    for(int i=0;i<t;i++){
	        long prisoners=sc.nextLong();
	        long sweets=sc.nextLong();
	        long start=sc.nextLong();

	        long result=(start+sweets-1)% prisoners;    

	            if(result ==0){
	                System.out.println(prisoners);
	            }else{
	                System.out.println(result);
	            }
	        }		
		
	}
}