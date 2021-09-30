package first;

import java.util.Scanner;

public class GCDorHCFofTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Two Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("The GCD of "+num1+" "+ num2+" is "+gcd);
		
		
		
		
		

	}

}
