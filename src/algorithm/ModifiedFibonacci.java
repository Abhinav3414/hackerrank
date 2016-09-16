package algorithm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedFibonacci {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		BigInteger  t1=scan.nextBigInteger();
		BigInteger  t2=scan.nextBigInteger();
		int n=scan.nextInt();
		BigInteger  sum= new BigInteger("0");
		
		for(int i=0;i<n-2;i++)
		{

			BigInteger  mul=t2.multiply(t2);
			sum=t1.add(mul) ;  // sum=t1+t2
			t1=t2;
			t2=sum;
		
			
			
		}
		System.out.println(sum);
		
	}

}
