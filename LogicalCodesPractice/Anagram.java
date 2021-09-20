package stringanagram;

import java.util.Arrays;

public class Anagram {
	//1 method using Iterative method
	
	
	public static void isAnagram(String s1,String s2)
	{
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");
	     s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length()) {
			int len1=s1.length();
			int len2=s2.length();
			
			for(int i=1;i<len1;i++)
			{
				for(int j=1;j<len2;j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
						break;
					else
						continue;
				}
			}
			System.out.println("Two Strings are Anagram..");
		}
		else
		{
			System.out.println("Two Strings are not anagram..");
		}
		
	}
	
	
	
	//2 method using Array and sort
	public static boolean anagra(String str1,String str2)
	{
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		
		if(str1.length()!=str2.length())
			return false;
		else
		{
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1,c2);
		}
	}
	
	
	
	//3 method using String Builder
	public static boolean ana(String st1,String st2)
	{
		st1=st1.replaceAll("\\s", "").toLowerCase();
		st2=st2.replaceAll("\\s", "").toLowerCase();
		boolean flag=true;
		if(st1.length()==1  && st2.length()==1)
		{
			if(st1.equals(st2))
			return true;
		}
		if(st1==null || st2==null)
		{
			return false;
		}
		if(st1.length()!=st2.length()) {
			return false;
		}
		else
		{
			char c1[]=st1.toCharArray();
			StringBuilder sb=new StringBuilder(st2);
			for(char c: c1)
			{
				int index=sb.indexOf(""+c);
				if(index!=-1)
				{
					sb.deleteCharAt(index);
					 
				}
				else
				{
					flag=false;
					break;
				}
				
			}
			
		}
		return flag;
	}
	

	public static void main(String[] args) {
		
		//1 method
		isAnagram("java","java");
		//2 method
		System.out.println(anagra("Practice","practice"));
		
		//3 method
		System.out.println(ana("cat","Cat"));	
		
	}

}
