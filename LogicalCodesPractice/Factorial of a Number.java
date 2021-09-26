import java.util.Scanner;
public class Factorial{
  
  public static void  main(String[]args)
  {
    //findFact(5);
    System.out.println("Enter  a Number: ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int fact=1;
    for(int i=num;i>=1;i--)
    {
      fact+=i;
    }
    System.out.println("The Factorial of "+num+" is"+fact);
  }
  //Using Recursion...
  public static int findFact(int num)
  {
    
    if(num<1)
      return -1;
    else
      return num*findFact(num-1);
   }

}
  

      
    
