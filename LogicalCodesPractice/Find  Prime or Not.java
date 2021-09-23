import java.util.Scanner;
public class Prime{
public static void main(String[]args)
{
  System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  boolean isPrime=true;
		  for(int i=2;i<num;i++)
		  {
		    if(num%i==0)
		    {
		      isPrime=false;
		      break;
		    }
		   
		  }
		  if(isPrime)
		  {
			  System.out.println(" "+num+" is Not a Prime Number..");
		  }
		  else
		  {
			  System.out.println(""+num+" is Not a Prime Number..");
		  }
  }
}
