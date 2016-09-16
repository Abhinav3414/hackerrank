package algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdInfinitum16_LeonardoPrimeFactors {


	public static boolean isNumProme(long num){
		boolean isprime = true;
	    if ( num > 2 && num%2 == 0 ) {
	
	        isprime= false;
	    }
	    int top = (int)Math.sqrt(num) + 1;
	    for(long i = 3; i < top; i+=2){
	        if(num % i == 0){

	            isprime= false;
	        }
	    }

	    return isprime; 
	}
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long t = scan.nextLong();

		Set<Long> primeSet = new HashSet<Long>();

		for (long i = 0; i < t; i++) {
			
			
			
			long n = scan.nextLong();
		//System.out.println("hi "+i);
				if (n == 1)
					System.out.println(0);
				else if(n==2 || n==3)
					System.out.println(1);
				
			else {
		//		System.out.println("else");
				  int top = (int)Math.sqrt(n) + 1;
				
				for (long z= 2; z <top; z++) {
					if (n % z == 0) {
						primeSet.add(z);
						// System.out.println("asd  "+i);
					}
				}
				
			//	System.out.println(primeSet);

				for (Long integer : primeSet) {

					boolean isPrime = isNumProme(integer);
					if (isPrime == false) {
						primeSet.remove(integer);
					}
				}

				System.out.println(primeSet.size());
				primeSet.clear();
				
			}

		}

	}

}





