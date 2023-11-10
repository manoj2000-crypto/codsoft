package task3;

import java.util.Scanner;

public class ATM {
	
	private BankAccount userAccount;
	
	public ATM(BankAccount account) 
	{
		this.userAccount = account;
	}
	
	public void displayMenu() 
	{
		System.out.println("Welcome to the ATM. \tChoose an option");
		System.out.println("1. Withdraw\t2. Deposit\t3. Check Balance\t0. Exit");
	}
	
	public void start() 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do 
		{
			displayMenu();
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1 :
				System.out.print("Enter the amount to withdraw : Rs. ");
				double withdrawAmount = sc.nextDouble();
				
				if(withdrawAmount > 0)
				{
					userAccount.withdraw(withdrawAmount);
				}
				else 
				{
					System.out.println("Invalid amount! Please enter a positive value.");
				}
				break;
			case 2:
				System.out.print("Enter the amount to deposit : Rs. ");
				double depositAmount = sc.nextDouble();
				
				if(depositAmount > 0)
				{
					userAccount.deposit(depositAmount);
				}
				else 
				{
					System.out.println("Invalid amount! Please enter a positive value.");
				}
				
				break;
			case 3:
				System.out.println("Your current balance : Rs. " + userAccount.getBalance());
				break;
			case 0:
				System.out.println("Exiting. Thank you for using the ATM");
				break;
			default : 
				System.out.println("Invalid choice! Please enter a valid option.");
				break;
			}
			
		}while(choice != 0);
		
		sc.close();
	}

}
