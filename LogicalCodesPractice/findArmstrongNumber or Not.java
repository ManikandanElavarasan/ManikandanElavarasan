import java.util.Scanner;
public class Armstrong{

	public static void main(String[] args) {
		//153-->1*1*1 +5*5*5 + 3*3*3=153
		int n=370;
		int temp=n;
		int r,sum=0;
		while(temp>0)
		{
			r=temp%10;
			sum=sum+(r*r*r);
			temp=temp/10;
			
		}
		System.out.println("the sum is  "+sum);
		if(sum==n)
		{
			System.out.println("the given number is armstrong number  "+sum +"  =  "+n);
		}
		else
		{
			System.out.println("the given number is not armstrong number..");
		}
		
		
		
	}

}
