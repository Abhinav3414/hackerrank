package algorithm;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int a[][]= new int[6][6];
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		int h[]= new int [16];
		int k=0,sum=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				h[k]=sum+(a[i][j]+a[i][j+1]+a[i][j+2])+(a[i+1][j+1])+
						(a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
				k++;
			}
			
		}
		
		/*System.out.println(k);
		for (int i : h) {
			System.out.print(i+ " ");
		}*/
		
		int max=-10000;
		for (int i = 0; i < h.length; i++) {
			if(h[i]>max)
				max=h[i];
		}
		System.out.println(max);
	}
	
}
