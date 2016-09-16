package algorithm;

import java.util.Scanner;

public class Abbreviation {
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++)
		{
			String str1= scan.nextLine();
			String str2= scan.nextLine();
			
			String str3=str1;
			
		//	System.out.println(str3);
			//System.out.println(str2);
			int sum=0;
			for(int a=0;a<str2.length();a++)
			{
				for(int b=a;b<str3.length();b++)
				{
					if((str2.charAt(a)==str3.charAt(b))||(str2.charAt(a)==str3.toUpperCase().charAt(b)))
					{
					//	System.out.println(str2.charAt(a)+"   "+str3.charAt(b));
						sum++;
						break;
					}
				}
			}
		
			//System.out.println(sum);
			if(str2.length()==sum)
			{
				System.out.println("YES");

			}
			else
				System.out.println("NO");;
		}
		
	}

}
