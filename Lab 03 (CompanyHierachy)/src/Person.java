
public class Person 
{
	Name name;
	Date dateOfBirth;
	static int numPerson = 0;

	Person(String firstName,String lastName,int day,int month,int year )
	{
		this.name = new Name(firstName,lastName);
		this.dateOfBirth = new Date(day , month,  year);
		numPerson = numPerson + 1; 
	}
	
	void printInfo() {
		System.out.println("Name: " + name.firstName + " " + name.lastName);
		System.out.println("DOB: " + dateOfBirth.day + "-" + dateOfBirth.month + "-" + dateOfBirth.year);
		this.printAgeAtYear(2024);
	}
	
	void printAgeAtYear(int year) {
		int age = (year)-(dateOfBirth.year);
		System.out.println("Age: "+ age);
		
	}
	
	static void printNumberOfPerson() {
		System.out.println("The total number of person is " + numPerson + " person(s)");
	}
}
