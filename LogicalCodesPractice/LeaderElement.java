package leaderelementfind;

public class LeaderElement {
	
	public static  void Leader(int number[])
	{
		if(number.length==1)
		{
			System.out.println(number[1]);
		}
		int max=number[number.length-1];
		System.out.print(max+" ");
		for(int i=number.length-2;i>=0;i--)
		{
			if(number[i]>max)
			{
				max=number[i];
				System.out.print(max+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		int number[]= {92,7,12,9,8,3,3};
		
		Leader(number);
		
		
		

	}

}
