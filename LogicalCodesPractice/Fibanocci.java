package fibanocci;

public class dexter {

	public static void main(String[] args) {
		// 0 1 1 2 3 4....10 we want to print like this
		int a=0,b=1;
		int k=0;
		System.out.print("0 ");
		System.out.print("1 ");
		while(k<=10)
		{
			k=a+b;
			System.out.print(" "+k);
			a=b;
			b=k;
		}
		

	}

}
