package print1t0100withoutnumber;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=1;
		a[3]=2;
		a[4]=5;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("The Duplicate element is  "+a[j]);
				}
						
					
						
			}
		}

	}

}
