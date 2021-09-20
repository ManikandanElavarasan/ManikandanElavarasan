package countchar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class count {

	public static void main(String[] args) {
		
		
		C.dupliacte("JAVA");
}

//find occurence characters in a string
static class C
{
	
	//find duplicate element and we can print occurence of the eleements....
	public static void dupliacte(String str)
	{
		if(str==null)
		{
			System.out.println("Null String");
			return;
		}
		 if(str.isEmpty())
		{
			System.out.println("Empty String");
			return;
		}
		 if(str.length()==1)
		{
			System.out.println("Single character");
			return;
		}
		
		
		char c[]=str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:c)
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		
		 Set<Map.Entry<Character, Integer>> entryset=map.entrySet();
		
	for( Map.Entry<Character,Integer> entry :entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
	        }  
		/*
	       if we want to print Occurence of letters we can print that as well using HashMap
	       
	       
		for( Map.Entry<Character,Integer> entry :entryset)
		{
			if(entry.getValue()>=1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
	        }*/
	
	
	
	
	
	}
}










