package algorithm;

public class Count {
	
	public static int[] countArray(String s)
	{
	
		int []countArr = new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			
			int asciiVal = s.charAt(i);
			countArr[asciiVal]++;
		}
		
		return countArr;
	}
	
	public static char findFirstMin(String s)
	{
		int []countArr=countArray(s);
		int index=0;
		for(int i=0;i<countArr.length;i++)
		{
			if(countArr[i]==1)
			{
				index=i;
				break;
			}
		}
		char val=(char) index;
		return val;
	}
	public static void main(String args[])
	{
		
		String s= "aabbccejhf";
		char n=findFirstMin(s);
			System.out.println("First Non Repeating character in String \""+s+"\" is: "+ n);		
		
	}

}
