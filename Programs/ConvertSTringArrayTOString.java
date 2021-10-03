package first;

public class ConvertSTringArrayTOString {

	public static void main(String[] args) {
		
		String arr[]= {"Mani","Muthu","Priyan"};
		
		String str=ConvertStringArrayToString(arr,",");
		System.out.println(str);
		
		
		
	}
	public static String ConvertStringArrayToString(String arr[],String Delimiter)
	{
		StringBuffer sb=new StringBuffer();
		for(String s:arr)
		{
			sb.append(s).append(Delimiter);
		}
		return sb.substring(0, sb.length()-1);
	}
}
