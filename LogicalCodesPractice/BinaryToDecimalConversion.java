package first;

import java.util.Scanner;

public class BinaryToDecimalConversion {
	

	public static void main(String[] args) {
		System.out.println("Enter a Binary Number: "); 
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int power=0;
		int decimal=0;
		while(temp!=0)
		{
			int rem=temp%10;
			decimal+=rem*Math.pow(2,power);
			temp=temp/10;
		  power++;
		  
		}
		System.out.println(decimal);
		
		
		

		
		
		
		
		
	}

}
