package print1t0100withoutnumber;

import java.util.stream.IntStream;

public class P {

	public static void main(String[] args) {
		/*A obj=new A();
		obj.display(1,100);
		
		
		char one='A'/'A';
		String s="..........";   //one way
		for(int i=one;i<=s.length()*s.length();i++)
		{
			System.out.println(i);
		}
		for(int i=one;i<='d';i++)   //another way using ascii values,ascii value for d is 100
		{
			System.out.println(i);
		}*/
		IntStream.range(1, 101).forEach(i->System.out.println(i));;

	}

}
//print 1 to 100 without loop
class A
{
	public void display(int start ,int end ) //one way
	{
		if(start<=end)
		{
			System.out.println(start);
			start++;
		    display(start,end);
		}
		
	}
}
