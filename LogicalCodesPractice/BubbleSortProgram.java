package sortingtechniques;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSortProgram {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)  //Number of passes..
		{
			for(int j=0;j<size-i-1;j++)    //Iteration of each passes..
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		
		

	}

}
