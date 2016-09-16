package algorithm;

import java.util.Scanner;

public class TheTimeInWords {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int hh=scan.nextInt();
		int mm=scan.nextInt();
		
		String hour, nextHour;
		if(hh==1)		{	hour="one"; nextHour="two"; }
		if(hh==2)		{	hour="two"; nextHour="three";}
		if(hh==3)		{	hour="three"; nextHour="four";}
		if(hh==4)		{	hour="four"; nextHour="five";}
		if(hh==5)		{	hour="five"; nextHour="six";}
		if(hh==6)		{	hour="six"; nextHour="seven";}
		if(hh==7)		{	hour="seven"; nextHour="eight";}
		if(hh==8)		{	hour="eight"; nextHour="nine";}
		if(hh==9)		{	hour="nine"; nextHour="ten";}
		if(hh==10)		{	hour="ten"; nextHour="eleven";}
		if(hh==11)		{	hour="eleven"; nextHour="twelve";}
		if(hh==12)		{	hour="twelve"; nextHour="one";}
			
			
		
		
	}

}
