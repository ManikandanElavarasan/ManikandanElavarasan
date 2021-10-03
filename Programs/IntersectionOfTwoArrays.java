package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class IntersectionOfTwoArrays {
	

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6};
		List<Integer>list=new ArrayList<>();
		for(int value:a)
		{
			for(int data:b)
			{
				if(value==data)
				{
					list.add(value);
				}
			}
		}
		Integer intersection[]= {};
		intersection=list.toArray(intersection);
		System.out.println(Arrays.toString(intersection));
		
		
		
		
		
		
		

	}

}
