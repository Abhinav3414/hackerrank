package algorithm;

import java.util.Scanner;

public class FlippingBits {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		//sc.nextLine();
		
		for(int i=0;i<t;i++)
		{
			long num = sc.nextLong();
			long maxValue = (long) (Math.pow(2,32)-1);
			System.out.println(num ^ maxValue);		
	}
	
	}
}
