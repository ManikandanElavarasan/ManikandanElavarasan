package sortingtechniques;

import java.util.Scanner;

public class BinarySearchProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the Array ELements in Sorted Order: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the key which you want to found");
		int key=sc.nextInt();
		int first=0;
		int last=array.length-1;
		boolean flag=false;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(array[mid]==key)
			{
				flag=true;
				System.out.println("Key is Found at "+mid+" index");
				break;
			}
			else if(array[mid]<key)
			{
				first=mid+1;
			}
			else if(array[mid]>key)
			{
				last=mid-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element Not Found..");
		}
	}

}
