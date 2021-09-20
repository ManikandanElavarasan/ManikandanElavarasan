package swap;

public class num {

	public static void main(String[] args) {
		int a=3,b=2,temp;
		  System.out.println("before swapping a and b values are"+a +b);   
		  temp=a;                                                      
	      a=b;
		  b=temp;
		  System.out.println("After swapping a and b values are"+a +b);
		  
		  //first way using another variable.
		  
		 
		  System.out.println("before swapping a and b values are"+a +b);  
		  a=a^b; 
		  b=a^b;
		  a=a^b;
		  System.out.println("after swapping a and b values are"+a +b);
		  //second way
		
		System.out.println("before swapping a and b values are"+a +b);  
		a=a+b; //a=5      
		b=a-b; //b=3
		a=a-b; //a=2
		System.out.println(" after swapping the a  and b values are"+a +b);
		
		//third way
		System.out.println("before swapping a and b values are"+a +b);  
		b=a+b-(a=b);
		System.out.println(" after swapping the a  and b values are"+a +b);
		

	}

}
