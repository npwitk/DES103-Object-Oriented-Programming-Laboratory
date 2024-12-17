
public class TestCompanyHeirarchy {

	public static void main(String[] args) {

		String barrierLine = "-----------------------------------------\n";
		
		// Company Name
		
		System.out.println("#### FUTURETECH COMPANY INFORMATION #### \n");
		
		// Visitor Information
		
		System.out.println(">> Visitor Information" );
		
		Person person01 = new Person("Somyai","Yodiyum",15,4,1987);
		Person person02 = new Person("Pitak","Raksa",1,8,1980);
		person01.printInfo();
		System.out.println(barrierLine);
		person02.printInfo();
		System.out.println(barrierLine);
		
		// Employee Information
		
		System.out.println(">> Employee Information" );
		Employee employee01 = new Employee("Maneeya","Rinrom",15,4,1987,"FutureTech Co.","Secretary",15000.0);
		Employee employee02 = new Employee("Parinya","Yenjid",5,11,1990,"FutureTech Co.","Technician",22000.0);
		employee01.printInfo();
		System.out.println(barrierLine);
		employee02.printInfo();
		System.out.println(barrierLine);
		
		// Executive Information
		
		System.out.println(">> Executive Information");
		Executive executive01 = new Executive("Preecha","Yanusit",30,4,1977,"FutureTech Co.","Sale Manager",40000.0,80000.0);
		Executive executive02 = new Executive("Songpol","Sangar",10,11,1972,"FutureTech Co.","Finanace Manager",38000.0,76000.0);
		executive01.printInfo();
		System.out.println(barrierLine);
		executive02.printInfo();
		System.out.println(barrierLine);
		
		// Rule Announcement
		
		System.out.println(">> Rule Announcement");
		executive01.announceRule("No nap during work hours");
		System.out.println(barrierLine);

		// Rule Follower
		
		System.out.println(">> Rule Follower");
		employee01.followRule("No nap during work hours");
		employee02.followRule("No nap during work hours");
		System.out.println(barrierLine);
		
		// CEO Information
		
		System.out.println(">> CEO Information" );
		CEO ceo01 = new CEO("Sipol","Tongyai",19,9,1956,"FutureTech Co.","President",150000.0,500000.0,"BMW A5");
		ceo01.printInfo();
		System.out.println(barrierLine);
		
		// CEO Vision
		
		System.out.println(">> CEO Vision" );
		System.out.println("Sipol Tongyai shows becoming ISO standard");
		System.out.println(barrierLine);
		
		// Number of Person
		
		System.out.println(">> Number of Person");
		Person.printNumberOfPerson(); //มีคำสั่ง print ข้างในอยู่แล้ว

	}

}
