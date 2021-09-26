package first;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a Year: ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
	        if(year%4==0)  //Leap year means that should be divisible by 4
	        {
	        	if(year%100==0)//some century year may not be a leap year but those  will divisible by 4
	        	{
	        		if(year%400==0) //if a century is divisible by 400 then only we can say it as leap year
	        		{
	        			System.out.println(year+" is a Leap year ");
	        		}
	        		else
	        		{
	        			System.out.println(year+" 2is not a leap Year");
	        		}
	        	}
	        	else
	        	{
	        		System.out.println(year+" is  a Leap year ");
	        	}
	        	
	        }
	        else
	        {
	        	System.out.println(year+" is Not a Leap year ");
	        }
		


		
		
		
		

	}

}
