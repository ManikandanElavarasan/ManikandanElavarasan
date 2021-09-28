package first;

import java.util.Scanner;
//Automorphic number is a number whose square ends in the same digit as the number itself

public class AutomorphicNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int square=num*num;
		int rem=square%10;
		if(rem==num)
		{
			System.out.println(num+" is an AutomorphicNumber");
		}
		else
		{
			System.out.println(num+" is not an AutomorphicNumber");
		}
	}

}
