package searchingtechnique;

import java.util.Scanner;

public class LinearsearchProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size=sc.nextInt();
		System.out.println("Enter the Key Element which you want to Found: ");
		int key=sc.nextInt();
		boolean flag=true;
		int array[]=new int[size];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(array[i]==key)
			{
				flag=true;
				System.out.println("Key Found in index "+i+""+key);
				break;
				
			}
			else
			{
				flag=false;
			}
		}
		
		
		System.out.println(flag);
		
		

	}

}
