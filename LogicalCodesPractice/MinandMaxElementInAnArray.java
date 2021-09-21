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
	
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
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
			}
			System.out.println("Maximum element is: "+max);
			System.out.println("Minimum element is: "+min);
		
		


	}

}
