package BankApp;
import java.util.*;



public class BankApp {
	Scanner in= new Scanner(System.in);
	
static Checking checking= new Checking();
static Savings savings= new Savings();

	//FIND OUT HOW MUCH EACH ACCOUNT STARTED WITH
	public static void main(String[] args) {
		checking.setBalance(5000);
		savings.setBalance(5000);
		
		BankApp brian= new BankApp();
//		gcuBank();
		brian.displayMenu();
		

}
	public static void gcuBank() {
		System.out.println("This is my bank class");
	}
	private   void displayMenu() {

//		BankApp brian= new BankApp();
//		
		int option;
	do {
//		
		System.out.println(" MAIN MENU");
	
		
		System.out.println("Pick an option: ");
		System.out.println("---------------------");
		System.out.println(" 1: : Deposit to Checking");
		System.out.println(" 2: : Deposit to Savings");
		System.out.println(" 3: : Write a Check");
		System.out.println(" 4: : Withdraw from Savings");
		System.out.println(" 5: : Get balance");
		System.out.println(" 6: : Close month");
		System.out.println("---------------------");
		System.out.println(" 9: : Exit");
	option = in.nextInt();
	actionMenu(option);
} while (option != 9);
		}
		
	public void actionMenu(int userInput) {
	
	
	if(userInput==1) {
displayDepositChecking(77);
	}else if(userInput==2) {
	displayDepositSavings(566);
	}else if(userInput==3) {
		dislayWithdrawlCheckings(77);
	}else if(userInput==4) {
	displayWithdrawlSavings(88);
	}else if(userInput==5) {
	displayBalanceScreen();
	}else if(userInput==6) {
	doEndMonth();
	}else {
	displayExitScreen();
	}
	
	
	}
	
	
	
   private  void doEndMonth() {
double balance=checking.getBalance();
double saving=savings.getBalance();


   if(saving<200) {
saving=saving-25;
	   System.out.println("Your below the minimum balance for the month, you will be charged a service fee of $25.00, your new balance is  "+balance);
	
	   savings.setBalance(saving);
	
	   
   }else {
	   System.out.println("Your current balance is"+saving);
	   
   }
   double newSavings =(saving+(saving*.06)/12);
   savings.setBalance(newSavings);
   System.out.println("You earned an annuel interest rate of .06, Your new balance with interest is"+newSavings);
   
   System.out.println("Your checking balance is"+ balance);

   }
	
	   
	   
	
   private static void displayExitScreen() {

System.out.println("Exit");
   }
   private  void displayBalanceScreen() {
//	BankApp brian= new BankApp();
//	  balance=brian.displayWithdrawlSavings(400);
//	  return balance;
	   
	System.out.println("Press 1 for checking or press 2 for savings");
	int selection=in.nextInt();
	
	if(selection==1) {
		System.out.println("Your checking balance is"+checking.getBalance());
	}else if(selection==2) {
		System.out.println("Your savings balance is"+savings.getBalance());
	}
   }
private double displayWithdrawlSavings(double withdrawlAmount) {
	

	
	double balance=savings.getBalance();
	
	
	System.out.println("You balance is "+ balance+"how much would you like to withdrawl?");
   
	
     withdrawlAmount=in.nextDouble();
     double newBalance=(balance-withdrawlAmount);
     if(newBalance<0) {
 newBalance=newBalance+withdrawlAmount;
   System.out.println("You cannot withdrawl more money than you have in your account, your balance is still"+newBalance);
  
    
 	
     }else {
    	 savings.setBalance(newBalance);
    	 System.out.println("You just withdrew "+withdrawlAmount+"Your new balance is"+newBalance);
     }
return newBalance;

     }
     
	

	

	
	


private  double dislayWithdrawlCheckings(double withdrawl) {

	double balance=checking.getBalance();
	System.out.println("Your current balance is $"+balance+" how much would you like to withdrawl?");
	 withdrawl= in.nextDouble();
	 
	double newBalance= balance-withdrawl;
	if(newBalance<0) {
		newBalance=newBalance-45;
		System.out.println("You overdrew your account and will be charged an overdraft fee of 45$ your new balance is"+ newBalance);
		checking.setBalance(newBalance);
	}else {
	checking.setBalance(newBalance);
	System.out.println("Congratulations, you just withdrew "+withdrawl+" Your new balance is "+ checking.getBalance());

	}
return newBalance;
}
private  double displayDepositSavings(double depositAmount) {

	double balance=savings.getBalance();
	System.out.println("Please enter the amount to deposit");
 depositAmount=in.nextDouble();

 
 double newBalance=depositAmount+savings.getBalance();
 savings.setBalance(newBalance);
	System.out.println("Congrats you just deposited "+depositAmount+" into your Savings account");
	System.out.println("Your savings balance is "+newBalance);
	
	savings.setBalance(newBalance);
	return newBalance;
	

	
	
}
private  double displayDepositChecking(double depositAmount) {

	
	double balance= checking.getBalance();
	System.out.println("Please enter the amount to deposit");
	 depositAmount=in.nextDouble();
	double newBalance=balance+depositAmount;
	System.out.println("Congrats you just deposited "+depositAmount+" into your bank account");
	checking.setBalance(balance+depositAmount);
	System.out.println("Your checking balance is "+newBalance);
 checking.setBalance(newBalance);
 return newBalance;

	
	
}

}








