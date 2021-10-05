import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {

	public static void main(String[] args) {
		LocalDate ld= LocalDate.now();
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER YOUR DATE OF BIRTH  YEAR,MONTH,DATE");
		int year=input.nextInt();
		int month=input.nextInt();
		int date=input.nextInt();
		LocalDate bd=LocalDate.of(year, month, date);
		int age=Period.between(bd, ld).getYears();
		System.out.println("YOUR AGE IS  "+age);
	}

}
