package algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		
		BigInteger f=new BigInteger("1");
		
		for(int i=1;i<=t;i++)
		{
			String iStr=String.valueOf(i);
			BigInteger b= new BigInteger(iStr);
			f=f.multiply(b);
		}
		
		System.out.println(f);
			
	}

}
