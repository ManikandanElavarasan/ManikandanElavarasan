package first;

public class FindTheNumberOfWordsAreOfGivenLength {

	public static void main(String[] args) {
		/**
		 * Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”}
		 * Input2:2 Output1:2
		 * 
		 * Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
		 * 
		 * Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
		 */
		
		String arr[]= {"aa","b","cc","ddd"};
		int len=2;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			if(s.length()==len)
			{
				count++;
				System.out.println(len + " Length is " + arr[i]);
			}
		}
		if (count >= 1) {
			System.out.println(count + "   times present in given array ");
		} else {
			System.out.println("No array present in the given length");
		}
		
		

	}

}
