package perfect;//6-->1+2+3=6 if we take any number ,first we have to write the factors of the number.and we have to addd them
                          //if the result is same as the number then that numbere is called perfect number
import java.util.Scanner;
public class P {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
        	if(n%i==0)
        	{
        		sum=sum+i;
        	}
        }
        if(n==sum)
        {
        	System.out.println("The Given Number "+n+" is Perfect Number");
        }
        else
        {
        	System.out.println("The Given Number "+n+" is Not a Perfect Number");
        }
	}

}
