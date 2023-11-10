package task3;

public class Action {

	public static void main(String[] args) {
		
		BankAccount userAccount = new BankAccount(10000);
		ATM atm = new ATM(userAccount);
		
		atm.start();
		
	}

}
