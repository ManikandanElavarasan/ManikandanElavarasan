package first;

import java.util.Scanner;

//Harshad number is a number which should be be divisible by sum of each digit of that Number

public class HarshadNumber {
	public static int findSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=findSum(n);
		if(n%num==0)
		{
			System.out.println(n+" is a HarshadNumber");
		}
		else
		{
			System.out.println(n+" is not a HarshadNumber");
		}
		
		
	
	}

}
