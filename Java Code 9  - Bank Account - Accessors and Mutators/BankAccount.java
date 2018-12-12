/*
----------------------------------------------------------------------------------------------------------------------------------------------------
AUTHOR: TRITON -(STEFAN MUNNIK)
JAVA - Bank Account - TUTORIAL NINE
----------------------------------------------------------------------------------------------------------------------------------------------------
*/
/*
NB:	If you have not seen my previous java tutorials and you have no coding experience please go back to see the basic functions and methods you need
	for the rest of the tutorials.

TIPS:
-Accessors used to get the values of private variables
-Mutators used to set the values of private variables
-Object oriented programming
*/
public class BankAccount{
	//Global variables (accessable by all functions in calss) used to store various inputs
    private int accountNo;
    private String accountName;
    private double accountBalance;
    private String date;
    
//Constructor class to set the standaard values user input
//Constructor class is always has the same name as the class itself (BankAccount)
    public BankAccount(int newAccountNo, String newAccountName, double newAccountBalance, String newDate){
        newAccountNo = 000000;
        newAccountName = "XXXXXXXXXXX";
        newAccountBalance = 32000;
        newDate = "06/06/2018";
    }

//Accessors - Get the value of the private fields
	//Get the account number value of the private variable accountNo
	public int getAccountNo(){
        return accountNo;
    }
	//Get the account name string of the private variable accountName
	public String getAccountName(){
        return accountName;
    }
	//Get the account balance value of the private variable accountBalance
    public double getAccountBalance(){
        return accountBalance;
	}
	//Get the account date created of the private variable date
	public String getDate(){
        return date;
	}
	
	
//Mutators - Set the values of the private fields
	//Set the private variable accountNo to the account number inputted by the user
    public void setAccountNo(int newAccountNo){
        accountNo = newAccountNo;
    } 
	//Set the private variable accountName to the account name inputted by the user
    public void setAccountName(String newAccountName){
		//Account name can only be between 1-12
        if (newAccountName.length()<13){
            accountName = newAccountName;            
        }
        else{
            System.out.println("Account name must not be more than 12 letters.");
        }
    }
    //Set the private variable accountBalance to the account balance inputted by the user
    public void setAccountBalance(double newAccountBalance){
        if (newAccountBalance>0){
			accountBalance = newAccountBalance;
		}
        else{
            System.out.println("Account balance must not negative.");
		}
	}
	//Set the private variable date to the account date created inputted by the user
    public void setDate(String newDate){
        date = newDate;
	}
    
	
	//Add the deposited amount by the user to the account balance
    public void Deposit(double DepositAmmount){
        accountBalance = accountBalance + DepositAmmount;
	}
    
	//Subtract the withdrawal amount from the account balance
    public void Withdrawal(double WithdrawalAmmount){
        accountBalance = accountBalance + WithdrawalAmmount;
	}
    
	//Print all private variables
    public String toString(){
            return ("Account Number:  " + accountNo + "\n" + "Account Name:  " + accountName + "\n" + "Account Balance:  " + accountBalance + "\n" + "Date Created:  " + date);
	}
	
	//Empty main method so that java does not complain...
	public static void main(String[] args){
		
	}
}