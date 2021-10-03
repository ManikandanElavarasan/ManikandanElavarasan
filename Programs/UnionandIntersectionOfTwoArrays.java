package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionandIntersectionOfTwoArrays {

	public static void main(String[] args) {
        Integer arr1[]= {1 ,2 ,3 ,4 };
        Integer arr2[]= {3 ,4 ,5 ,6};
       System.out.println("The Intersection of Given arrays are: "+intersection(arr1,arr2));
       System.out.println("The Union Of Two Given Arrays are: "+union(arr1,arr2));
		System.out.println("The Union And Intersection are: "+unionIntersection(intersection(arr1,arr2),union(arr1,arr2)));
	}
	
	public static HashSet<Integer> intersection(Integer[]a,Integer[]b)  //A intersection B
	{
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					set.add(a[i]);
				}
			}
		}
		Integer intersection[]= {};
		intersection=set.toArray(intersection);
		
		return set;
	}
	public static HashSet<Integer> union(Integer[]a,Integer[]b)  A union B
	{
		HashSet<Integer>set=new HashSet<>();
		set.addAll(Arrays.asList(a));
		set.addAll(Arrays.asList(b));
		
		Integer union[]= {};
		    union= set.toArray(union);
		
		return  set;
	}
	public static HashSet<Integer> unionIntersection(HashSet<Integer> set1,HashSet<Integer> set2) //A union B - A intersection B
	{
		for(Integer value:set1)
		{
			if(set2.contains(value))
			{
				set2.remove(value);
			}
		}
		Integer unionintersect[]= {};
		unionintersect=set2.toArray(unionintersect);
		return set2;
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

