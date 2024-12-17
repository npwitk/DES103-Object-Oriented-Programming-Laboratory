
public class Person {
	String name;
	String surname;
	String sex;
	String occupation;
	String organization;
	
	Person(String firstName, String lastName, String sexual, String job, String work){
		name = firstName;
		surname = lastName;
		sex = sexual;
		occupation = job;
		organization = work;
	}
	
	void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Sex: " + sex);
		System.out.println("Occupation: " + occupation);
		System.out.println("Organization: " + organization);
	}
}
