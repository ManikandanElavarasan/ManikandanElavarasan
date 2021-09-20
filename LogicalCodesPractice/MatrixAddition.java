package matrixarray;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		System.out.println("Enter the Number of Columns:");
		int cols=sc.nextInt();
		int[][] Matrix1=new int[rows][cols];
		int[][] Matrix2=new int[rows][cols];
		int[][] results=new int[rows][cols];
		System.out.println("Enter the elements for matrix 1:  ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				Matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements for matrix 2:  ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				Matrix2[i][j]=sc.nextInt();
			}
		}
		for(int i[]:Matrix1)
		{
			System.out.print(Arrays.toString(i));
		}
		System.out.println(" ");
		for(int i[]:Matrix2)
		{
			System.out.print(Arrays.toString(i));
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				results[i][j]=Matrix1[i][j]+Matrix2[i][j];
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(results[i][j]+" ");
			
			}
			System.out.println(" ");
		}



		
		
		
		
		
	}

}
