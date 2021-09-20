package palindrome;

public class demob {

	public static void main(String[] args) {
		String orig="mani";                            //palindrome with string
		String rev=" ";
		for(int i=orig.length()-1;i>=0;i--)
		{
			rev+=orig.charAt(i);
		}
		System.out.println(" "+rev);
		if(orig.equals(rev))
		{
			System.out.println("The given string is palindrome"+orig+"="+rev);
		}
		else
		{
			System.out.println("The given string is not palindrome   "+orig);
		}
		
		
		//palindrome with numbers....
		int n=123;
		int temp=n;
		int rev1=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev1=(rev1*10)+rem;
			temp=temp/10;
		}
		System.out.println(n+ " "+rev1);
		if(n==rev1)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not palindrome");
		}

	}
}
