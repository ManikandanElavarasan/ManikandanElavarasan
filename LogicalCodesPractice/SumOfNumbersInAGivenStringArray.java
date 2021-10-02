package first;

public class SumOfNumbersInAGivenStringArray {

	public static void main(String[] args) {
		String[] StrArr = { "2A", "12", "ABC", "6GT", "IH8" };
        int sum=0;
        for(int i=0;i<StrArr.length;i++)
        {
        	String s=StrArr[i];
        	for(int j=0;j<s.length();j++)
        	{
        		if(Character.isDigit(s.charAt(j)))
        		{
        			sum+=Integer.parseInt(String.valueOf(s.charAt(j)));
        		}
        		
        	}
        }
        System.out.println(sum);
        double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;

		double square = (x1 + x2) * (x1 + x2) + (y1 + y2) * (y1 + y2);
		System.out.println(square);
		int squareRoot = (int) Math.sqrt(square);

		System.out.println(squareRoot);
		
	}

}
