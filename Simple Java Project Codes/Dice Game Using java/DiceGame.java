import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	
	public static void main(String[] args) {
		int user_choice,computer_choice;
		int user_score=0,computer_score=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter How many Rounds: ");          //ask the user to enter the rounds.
		int round=input.nextInt();
		Random random=new Random();
		for(int i=1;i<=round;i++)
		{
			user_choice=random.nextInt(6)+1;
			computer_choice=random.nextInt(6)+1;
			if(user_choice>computer_choice)
			{
				user_score++;
			}
			else if(computer_choice>user_choice)
			{
				computer_score++;
			}
		}
		System.out.println("Your Score is "+user_score);
    
		System.out.println("Computer Score is "+computer_score);
		
		if(user_score>computer_score)
		{
			System.out.println("YOU WON THE MATCH!!!..");
		}
	    if(computer_score>user_score)
		{
			System.out.println("COMPUTER WON \nclick run button until you win");
		}
		if(user_score==computer_score)
		{
			System.out.println("MATCH IS DRAW \nclick run button to play Again");
		}





	}

}
