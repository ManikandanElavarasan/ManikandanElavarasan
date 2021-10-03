package matrixarray;

import java.util.Scanner;

public class MinandMaxElementInAnArray {

	public static void main(String[] args) {
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++)
		{
		    array[i]=sc.nextInt();	
		}
		    min=max=array[0];
		    for(int j=1;j<size;j++)
				{
					if(array[j]<min)
					{
						min=array[j];
					}
					else
					{
						max=array[j];
					}
				}
			
			int sum=max+min;
		System.out.println("Sum of Maximum and Minimum is numbers is: "+sum);
		
		


	}

}
