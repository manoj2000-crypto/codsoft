package task3;
/*
 * Name : Manoj Kale
 * Task 3 : ATM Interface.
 * */
public class BankAccount {
	
	private double balance;
	
	public BankAccount(double initialBalance) 
	{
		this.balance = initialBalance;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited : Rs. " + amount);
	}
	
	public boolean withdraw(double amount)
	{
		if(balance >= amount) 
		{
			balance -= amount;
			System.out.println("Withdraw : Rs. " + amount);
			return true;
		}
		else 
		{
			System.out.println("Insufficient balance ! Withdraw failed.");
			return false;
		}
	}

}
