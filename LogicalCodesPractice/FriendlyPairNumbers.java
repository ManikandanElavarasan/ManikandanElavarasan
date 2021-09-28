package first;

import java.util.Scanner;
//friendlyPair numbers are two natural numbers,sum of factors of first number should be equal to the second number
//sum of factors of second number is equal to the first number...
public class FriendlyPairNumbers {
	public static int findFactorsSum(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			  sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the First Numbers: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter the Second Numbers: ");
		int num2=sc.nextInt();
		int SumofFactorsofnum1=findFactorsSum(num1);
		int SumofFactorsofnum2=findFactorsSum(num2);
		if(SumofFactorsofnum1==num2 && SumofFactorsofnum2==num1)
		{
			System.out.println("Both Numbers are Friendly Pair Numbers..");
		}
		else
		{
			System.out.println("Both Numbers are not Friendly Pair Numbers..");
		}


	}

}
