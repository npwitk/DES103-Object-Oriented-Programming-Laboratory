package Developer;

public class BankAccount {
	private String ownerName;
	String accountNumber;
	private double balance;
	public int numAccount = 0;

	public BankAccount(String ownerName, String accountNumber, double balance) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		numAccount++;
	}
	
	//Encapsulation
	public double getBalance(){
		return this.balance;
	}
	
	public String getAccountNumber(){
		return this.accountNumber;
	}
	

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit: $" + amount);
	}

	protected void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
			System.out.println("Withdraw: $" + amount);
		} else {
			System.out.println("Not enough balance!");
		}
	}
	
	public void printInfo() {
		System.out.println(ownerName + "\t" + accountNumber + "\t" + balance);
	}
}


