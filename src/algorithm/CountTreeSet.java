package algorithm;

import java.util.Map;
import java.util.TreeMap;

public class CountTreeSet {

	public static  TreeMap<String, Integer> buildTreeMap(String s)
	{
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		for(int i=0;i<s.length();i++)
		{
			char character= s.charAt(i);
			String temp = Character.toString(character);
			if(tm.containsKey(temp))
			{
				Integer Value= tm.get(temp);
				Value++;
				tm.put(temp, Value);
			}
			else
				tm.put(temp, 1);
		}
		
		return tm;
	}
	
	public static void treeMap (String s)
	{
		TreeMap<String, Integer> tm =buildTreeMap(s);

		for(Map.Entry<String,Integer> entry : tm.entrySet()) 
		{
			  String key = entry.getKey();
			  Integer value = entry.getValue();
			  if(value==1)
			  {
				  System.out.println(key + " => " + value);
				  break;
			  }
			}	
	}
	public static void main(String args[])
	{		
		String s="GeeksforGeeks";
		treeMap(s);
	}
}
