import java.util.Scanner;

public class ATM {
	private int total=100;
	Scanner input=new Scanner(System.in);

public void startAtm()
{
	userAccount();
	userPin();
	drawMainMenu();
}
public  long userAccount()                                        //Ask the user to enter account number
{
	System.out.println("Enter Your Account Number: ");
	long accnumber=input.nextInt();
	return accnumber;
}
public int userPin()                                             //Ask the User to Enter  Account Pin
{
	System.out.println("Enter Your Account Password: ");
	int pin=input.nextInt();
	return pin;
}
public void drawMainMenu()                                     //Asking the user to what they need to do operation
{
	
	System.out.println("ATM MAIN MENU ");
	System.out.println("1 - VIEW ACCOUNT BALANCE ");
	System.out.println("2 - WITHDRAW FUNDS ");
	System.out.println("3 - Add Funds");
	System.out.println("4 - TERMINATE TRANSACTION ");
	System.out.println("Enter a Choice");
	int select=input.nextInt();
	switch(select)
	{
	case 1:
		viewAccountBalance();
		break;
	case 2:
		withdrawFunds();
		break;
	case 3:
		addFunds();
	case 4:
		System.out.println("Thank You For Using This ATM!! Welcome Again!! ");
		break;
	default:
		System.out.println("Please Enter a Valid Choice");
	}
}
public void viewAccountBalance()    //if the user entered 1 the account balance will be showed.
{
	System.out.println("Account Balance");
	System.out.println("Your Account Balance is "+total);
	drawMainMenu();
	
}
  public void withdrawFunds()      //if the user entered 2 the withdraw option will be Performed.
{
	int withdrawSelection;
	System.out.println("WITHDRAW CHOICE");
	System.out.println("1 -$20");
	System.out.println("2 -$40");
	System.out.println("3 -$60");
	System.out.println("4 -$100");
	System.out.println("5 -BACK TO MAIN MENU");
	System.out.println("ENTER A CHOICE: ");
	withdrawSelection=input.nextInt();
	switch(withdrawSelection)
	{
	case 1:
		checkNSF(20);
		drawMainMenu();
		break;
	case 2:
		checkNSF(40);
		drawMainMenu();
		break;
	case 3:
		checkNSF(60);
		drawMainMenu();
		break;
	case 4:
		checkNSF(100);
		drawMainMenu();
		break;
	case 5:
		drawMainMenu();
		break;
	default:
		System.out.println("ENTER A VALID CHOICE");
		break;
		}
	}
  public void checkNSF(int withdrawAmount)
{
	if(total-withdrawAmount<=0)
		System.out.println("***INSUFFICIENT BALANCE IN YOUR ACCOUNT****");
	else
		total=total-withdrawAmount;
	System.out.println("***PLEASE TAKE YOUR MONEY NOW***");

}
   

public void addFunds()                    //if the user entered 3 they can deposit Money in their account.
{
	int addSelection;
	System.out.println("DEPOSIT CHOICE");
	System.out.println("1 -$20");
	System.out.println("2 -$40");
	System.out.println("3 -$60");
	System.out.println("4 -$100");
	System.out.println("5 - BACK TO MAIN MENU");
	System.out.println("Enter a Choice: ");
	addSelection=input.nextInt();
	switch(addSelection)
	{
	case 1:
		deposit(20);
		drawMainMenu();
		break;
	case 2:
		deposit(40);
		drawMainMenu();
		break;
	case 3:
		deposit(80);
		drawMainMenu();
		break;
	case 4:
		deposit(100);
		drawMainMenu();
		break;
	case 5:
		drawMainMenu();
		break;
	default:
		System.out.println("ENTER A VALID CHOICE");
		}
	}
  public void deposit(int depAmount)     
{
	System.out.println("*** Please insert Your Money Now***");
	
	total+=depAmount;
	drawMainMenu();
}

  
  public static void main(String[]args) {
	   ATM atm=new ATM();
	   atm.startAtm();
		
		
	}

}

