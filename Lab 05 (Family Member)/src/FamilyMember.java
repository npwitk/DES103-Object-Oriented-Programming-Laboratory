public class FamilyMember {
	static String familyName = "Hilton";
	String firstName;
	static double commonFund = 100000.00;
	double privateFund;
	
	FamilyMember(String firstName, double privateFund){
		this.firstName = firstName;
		this.privateFund = privateFund;
	}
	
	void printPrivateFund(){
		System.out.println(this.firstName + " " + FamilyMember.familyName + " has $" + this.privateFund);
	}
	
	//THE END OF EXERCISE 1

	void contributeToCommonFund(double amount){
		this.privateFund = this.privateFund - amount;
		FamilyMember.commonFund = FamilyMember.commonFund + amount;
	}

	static void payFromCommonFund(double amount){
		FamilyMember.commonFund = FamilyMember.commonFund - amount;
	}

	static void printFamilyFund(){
		System.out.println("The " + FamilyMember.familyName + " family has $" + FamilyMember.commonFund);
	}
	
	//THE END OF EXERCISE 3

}
// what is protected? can access but in specific way, encapsulation
// how it line works.