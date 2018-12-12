/*
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Bank Account - TUTORIAL NINE
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java tutorials and you have no coding experience please go back to see the basic functions and methods you need
	for the rest of the tutorials.

TIPS:
-While the file BankAccount and BankAccountTester is in the same folder, functions can be called from both files.
-This File (BankAccountTester) calls all the functions from the BankAccount file.
-
*/
import java.util.Scanner;

public class BankAccountTester{
	public void userOptions(int userAccNo, String userAccName, double userAccBa, String userDate){
		//Scanner to read user inputs
        Scanner userInput = new Scanner(System.in);
		while (true){
			//Print the options for the user
            System.out.println("1. Create an account." + "\n" + "2. Deposit an amount." + "\n" + "3. Withdraw from an amount." + "\n" + "4. Display the balance of an account." + "\n" + "5. Quit.");
            System.out.println("Enter a number of choice:    ");
            int Choice = userInput.nextInt();
      
            if(Choice == 1){
                BankAccount yourBankAccount = new BankAccount(userAccNo, userAccName, userAccBa, userDate);
                
                System.out.println("Enter a unique account number of 1-9 numbers:   ");
                userAccNo = userInput.nextInt();
                yourBankAccount.setAccountNo(userAccNo);
                
                System.out.println("Enter the name of the account:   ");
                userAccName = userInput.next();
                yourBankAccount.setAccountName(userAccName);
                
                System.out.println("Enter the account balance:    ");
                userAccBa = userInput.nextDouble();
                yourBankAccount.setAccountBalance(userAccBa);
                
                System.out.println("Enter the userDate of the account added in format DD/MM/YY:    ");
                userDate = userInput.next();
                yourBankAccount.setDate(userDate);
                
                System.out.println(yourBankAccount.toString());
                continue;
			}
			
            if (Choice == 2){
                BankAccount yourBankAccount = new BankAccount(userAccNo, userAccName, userAccBa, userDate);
                
                System.out.println("Enter an amount you want to deposit:  ");
                double DepositAmount = userInput.nextDouble();
                if (DepositAmount>=0){
                    userAccBa = userAccBa + DepositAmount;
                    System.out.println("Account Balance:  " + userAccBa);
                    continue;
                }
                else{
                    System.out.println("The amount you want to deposit can't be negative.");
                    continue;
                }
            }
			
            if (Choice == 3){
                BankAccount yourBankAccount = new BankAccount(userAccNo, userAccName, userAccBa, userDate);
                
                System.out.println("Enter the amount you want to withdraw:   ");
                double WithdrawAmount = userInput.nextDouble();
                
                if (WithdrawAmount>=0){
                    userAccBa = userAccBa - WithdrawAmount;
                    if (userAccBa<0){
                        userAccBa = userAccBa + WithdrawAmount;
                        System.out.println("You can not withdraw more than you have.");
                    }
                    else{
                        System.out.println("Account Balance:   " + userAccBa);
                    }
                }
            }
            
            if (Choice == 4){
                System.out.println("Account Balance = " + userAccBa);
            }
            
            if (Choice == 5){
                break;
            }
     	}
	}

    public static void main(String[] args){	
		BankAccountTester Object = new BankAccountTester();
		//Set the variables to store user inputs
        int userAccNo = 0;
        String userAccName = "";
		double userAccBa = 0.0;
        String userDate = "";
        
		Object.userOptions(userAccNo, userAccName, userAccBa, userDate);
    }
}