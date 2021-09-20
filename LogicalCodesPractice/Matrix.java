package matrixarray;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		System.out.println("Enter the Number of Rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		System.out.println("Enter the Number of Columns:");
		int cols=sc.nextInt();
		int[][] array=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		/*for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}*/
		/*for(int i[]:array)
		{
			for(int n:i)
			{
				System.out.print(n+" ");
			}
			System.out.println("");
		}*/
		/*for(int[]r:array)
		{
		System.out.println(Arrays.toString(r));
		} */
		
		//System.out.println(Arrays.deepToString(array));
		Arrays.stream(array).forEach((e)->{
			
			Arrays.stream(e).forEach(i->System.out.print(i+" "));
		
		System.out.println("");
		
		});
		

	}

}
