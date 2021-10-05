import java.util.Scanner;

public class BMICalculator {
	
	public static void CalculationOfBMI()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("  ENTER YOUR WEIGHT IN KG  ");
		float weight=input.nextFloat();
		System.out.println("  ENTER YOUR HEIGHT IN cm  ");
		float height=input.nextFloat();
		
		float BMI=(100*100*weight)/(height*height);
		System.out.println("YOUR BMI is "+BMI);
		BMIcategory(BMI);
	}
	private static void BMIcategory(float BMI) {
		
		if(BMI<18.5)
			System.out.println("YOU ARE UNDER WEIGHT");
		else if(BMI<25)
		{
			System.out.println("YOU ARE NORMAL");
		}
		else if(BMI<30)
		{
			System.out.println("YOU ARE OVERWEIGHT");
		}
		else
		{
			System.out.println("YOU ARE OBESE");
		}


		
	}
	
	public static void main(String[] args) {
		CalculationOfBMI();
		}
}
