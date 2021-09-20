package pattern;

public class trick {

	public static void main(String[] args) {
		/* * * * * 
		   * * * *
		   * * * *
		   * * * *  */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("_________________________________");
		
		/* 
		 * * 
		 * * * 
		 * * * *  */  
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("_________________________________");
		
		
		/*    ****
		      ***
		      **
		      *  */
		 
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("_________________________________");
		
		/*  1 2 3 4
		    1 2 3 4
		    1 2 3 4
		    1 2 3 4 */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("_________________________________");
		
		/*  * * * *
		 *  *     *
		    *     *
		    * * * *   */
		 
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1||i==4||j==1||j==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("_________________________________");
		/* 1 2 3 4
		   2 3 4 1
		   3 4 1 2
		   4 1 2 3   */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
				{
					System.out.print(k-4 +" ");
				}
				else
				{
					System.out.print(k+" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("_________________________________");
		/* 1
		   0 1
		   1 0 1
		   0 1 0 1
		   1 0 1 0 1  */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("_________________________________");
		
		/* 1 
		   2 2 
		   3 3 3
		   4 4 4 4  */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("_________________________________");
		
		/*      *
		       **
		      ***
		     ****  */     
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("______________________________________");
		
		
		/*       *
		        * *
		       * * * 
		      * * * *   */
		 
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}  
		System.out.println("_________________________________");
		/* A
		   A B
		   A B C
           A B C D 
		   A B C D E 
		   A B C D E F  */
		int ascii=65;     // ascii value for A is 65 and a is 97
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(ascii+j)+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("________________________");
		/* A
		 * B B 
		 * C C C 
		 * D D D D
		 * E E E E E
		 * F F F F F F
		 */
		int as=65;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(as+i)+" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
	}

}
