package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {1 ,2 ,3 ,4 };
		int b[]= {3 ,4 ,5 ,6 };
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			list.add(b[i]);
		}
		Integer union[]= {};
		    union= list.toArray(union);
		System.out.println(Arrays.toString(union));
		
		
		
	}

}
