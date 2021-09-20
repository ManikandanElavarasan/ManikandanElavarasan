package matrixes;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows for Matrix: ");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns for Matrix: ");
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		int Transpose[][]=new int[rows][cols];
		System.out.println("Enter the data for matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				Transpose[j][i]=matrix[i][j];
			}
		}
		System.out.println("After Transposing the matrix: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(Transpose[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
	}

}
