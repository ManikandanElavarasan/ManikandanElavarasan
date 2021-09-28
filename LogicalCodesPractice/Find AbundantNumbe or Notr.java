package first;

import java.util.Scanner;

//Abundant Number is a number sum of factors should be greater than the number itself. 
public class AbundantNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		
		if(sum>n)
		{
			System.out.println(n+" is a Abundant Number..");
		}
		else
		{
			System.out.println(n+" is Not a Abundant Number..");
		}
		
		
		
	}

}
