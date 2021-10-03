package first;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DisplayUniqueCharacterInString {

	public static void main(String[] args) {
		String str="HelloWorld";
		char[]c=str.toCharArray();
		Set<Character>set=new LinkedHashSet<>();
		
		for(int i=0;i<c.length;i++)
		{
			set.add(c[i]);
		}
		StringBuilder sb=new StringBuilder();
		for(char ch:set)
		{
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
