package countchar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class count {

	public static void main(String[] args) {
		
		//C.find("Javascript",'v');
		//C.find1("java", 'v');
		C.dupliacte("Maha");
}

//find occurence characters in a string
static class C
{
	/*static int count1=0;
	public static void find(String s,char c)
	{
		for(char ch:s.toCharArray()) {
			if(ch==c)
			count1++;
			
		}
		System.out.println(c+":"+count1);
	}
	public static void find1(String s1,char val)
	{
		int count=0;
	
		for(int i=0;i<s1.length();i++)
		{
			if(val==s1.charAt(i))
			{
				count++;
			}
		}
		System.out.println(val+":"+count);
		
	} */
	
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
		
	
		
		
		
		
		
	}
	
	
	
	
	}
}










