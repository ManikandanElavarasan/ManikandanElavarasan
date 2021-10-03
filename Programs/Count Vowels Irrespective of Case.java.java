package first;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowels {

	public static void main(String[] args) {
		
		/**
		 * 2. Find the number of vowels in a given string Input1:”NewyorkE” 'e' or 'E' -
		 * it should be counted as 1 Output1:2 Hint:irrespective of case
		 */
		 int count = 0;
		 Set<Character>set=new LinkedHashSet<>();
	      System.out.println("Enter a String :");
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      s=s.toLowerCase();
	      for(int i=0;i<s.length();i++)
	      {
	    	  set.add(s.charAt(i));
	      }
	      for(char c:set)
	      {
	    	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	    	  {
	    		  count++;
	    	  }
	      }
	      System.out.println(count);
	      
	}

}
