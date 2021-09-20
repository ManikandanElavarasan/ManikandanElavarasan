package convertstringtoNumberwithoutparseIntmethod;

public class StringToNumber {
	
	public static int Convert(String str)
	{
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			 num=num*10+((int)str.charAt(i)-48);
		}
		return num;
	}
	public static int convertToInt(String str)
	{
		int n=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			n=n*10+((int)ch[i]-48);
		}
		return n;
		
	}

	public static void main(String[] args) {
		
		String s="123";
		System.out.println(Convert(s)+10);
		System.out.println(Convert(s));
		
		
		
		

	}

}
