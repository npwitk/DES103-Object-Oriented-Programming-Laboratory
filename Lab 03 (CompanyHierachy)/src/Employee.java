
public class Employee extends Person
{
	String workplace;
	String position;
	double salary;
	
	Employee(String firstName, String lastName, int day, int month, int year, String workplace, String position, double salary)
	{
		super(firstName, lastName, day, month, year);
		this.workplace = workplace;
		this.position = position ;
		this.salary = salary ;
	}
	void printInfo() 
	{
		super.printInfo();
		System.out.println("Workplace: " + this.workplace);
		System.out.println("Position: " + this.position);
		System.out.println("Salary: " + this.salary);
	}
	
	// follow what rule?
	
	void followRule(String rule) 
	{
		System.out.print(this.position + ": ");
		super.name.printName();
		System.out.println("Followed: " + rule);
	}
	
}
