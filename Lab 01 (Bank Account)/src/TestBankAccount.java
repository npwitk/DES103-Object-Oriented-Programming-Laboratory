
public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount bankAcc = new BankAccount("Wang","TaLu","Male","Actor","SIIT","000-000-0000",10);
		bankAcc.printInfo();
		bankAcc.person.name = "Nonprawich";
		bankAcc.person.surname = "Intakaew";
		bankAcc.person.sex = "Male";
		bankAcc.printInfo();
		bankAcc.deposit(15);
		bankAcc.printBalance();
		bankAcc.withdraw(5);
		bankAcc.printBalance();
		System.out.println(bankAcc.convertBalanceToTHB());

	}

}
