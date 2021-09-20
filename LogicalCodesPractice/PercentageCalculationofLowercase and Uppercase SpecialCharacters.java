package leaderelementfind;

import java.text.DecimalFormat;

public class PercentageCal {
	public static void Percentage(String str)
	{
		int len=str.length();
		int UppercaseCount=0;
		int LowercaseCount=0;
		int Digitscount=0;
		int Specchar=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				UppercaseCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				LowercaseCount++;
			}
			else if(Character.isDigit(ch))
			{
				Digitscount++;
			}
			else
			{
				Specchar++;
			}
		}
		DecimalFormat formatter=new DecimalFormat("##.##");
		double UppercasePercentage=(UppercaseCount*100.0)/len;
		double LowercasePercentage=(LowercaseCount*100.0)/len;
		double DigitPercentage=(Digitscount*100.0)/len;
		double SpecPercentage=(Specchar*100.0)/len;
		System.out.println("Given String:"+str);
		System.out.println("UppercasePercentage ----> "+formatter.format(UppercasePercentage));
		System.out.println("LowercasePercentage ----> "+formatter.format(LowercasePercentage));
		System.out.println("DigitPercentage ----> "+formatter.format(DigitPercentage));
		System.out.println("speccharPercentage ----> "+formatter.format(SpecPercentage));
		
	}

	public static void main(String[] args) {
		Percentage("Java Programming Practice $$$####");
	}

}
