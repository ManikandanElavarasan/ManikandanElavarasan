package first;

import java.util.Scanner;

public class FindStrongNumber {
	  
	public static  int findFact(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			int fact=findFact(rem);
			 sum=sum+fact;
			 temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is a Strong Number..");
		}
		else
		{
			System.out.println(num+" is Not a Strong Number..");
		}
		

	}

}
