
public class BankAccount {

	Person person;
	String accountNumber;
	double balance;
	
	BankAccount(String firstName, String lastName, String sexual, String job,String work, String ac, double ba) {
		person = new Person(firstName, lastName, sexual, job, work);
		balance = ba;
		accountNumber = ac;
	}
	
	void deposit(double x) {
		balance = balance + x;
	}
	
	void withdraw(double x) {
		balance = balance - x;
	}
	
	void printInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
	
	void printBalance() {
		System.out.println("Balance = " + balance + " million USD");
	}
	
	double convertBalanceToTHB() {
		return 35.64*balance;
	}
}
