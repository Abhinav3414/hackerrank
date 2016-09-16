package algorithm;

import java.util.Scanner;

public class maxSubaaray {

	
	public static int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
 
		return max;
	}
	
	public static void main(String[] args) {
		
		int a[]={2, -1, 2, 3, 4, -5};
		//System.out.print(maxSubArray(a));
		
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int arr[]= new int[n];
			
			for (int j=0;j<n;j++) {
				arr[j]=scan.nextInt();
			}
			System.out.print(maxSubArray(arr));
			int sum=0;
			for (int z : arr) {
				if(z>=0)
				sum=sum+z;
			}
			System.out.print(" "+sum);
			
		}
		
		
		
	}
	
	
}
