package countchar;
public class count {

	public static void main(String[] args) {
		
		C.find("Javascript",'v');
		C.find1("java", 'v');
}

//find occurence characters in a string  way-1 using charToArray Method
 class C
{
         static int count1=0;
	public static void find(String s,char c)
	{
		for(char ch:s.toCharArray()) {
			if(ch==c)
			count1++;
			
		}
		System.out.println(c+":"+count1);
	}
	 
	// find occurence characters in a string   way-2 using charAt Method
	 
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
		
	} 
	

	}
}










