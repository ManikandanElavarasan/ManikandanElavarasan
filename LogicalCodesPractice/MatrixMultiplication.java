package matrixarray;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value for matrix1:");
		int rowsmatrix1 =sc.nextInt();
		System.out.println("Enter the col for matrix1 value row for matrix2:");
		int colinMatrix1AndrowinMatrix2 =sc.nextInt();
		System.out.println("Enter the column value for matrix2: ");
		int colmatrix2=sc.nextInt();
		int matrix1[][]=new int[rowsmatrix1][colinMatrix1AndrowinMatrix2];
		int matrix2[][]=new int[colinMatrix1AndrowinMatrix2][colmatrix2];
		int product[][]=new int[rowsmatrix1][colmatrix2];	
		System.out.println("Enter the data for matrix 1:");
		for(int i=0;i<rowsmatrix1 ;i++)
		{
			for(int j=0;j<colinMatrix1AndrowinMatrix2;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the data for matrix2:");
		for(int i=0;i<colinMatrix1AndrowinMatrix2 ;i++)
		{
			for(int j=0;j<colmatrix2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("printed matrix 1:");
		for(int i=0;i<rowsmatrix1 ;i++)
		{
			for(int j=0;j<colinMatrix1AndrowinMatrix2;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("printed matrix 2:");
		for(int i=0;i<colinMatrix1AndrowinMatrix2;i++)
		{
			for(int j=0;j<colmatrix2;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<rowsmatrix1;i++)
		{
			for(int j=0;j<colmatrix2;j++)
			{
				for(int k=0;k<colinMatrix1AndrowinMatrix2;k++)
				{
					product[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		System.out.println("the result of product is:");
		
		for(int i=0;i<rowsmatrix1;i++)
		{
			for(int j=0;j<colmatrix2;j++)
			{
			     System.out.print(product[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
