public class FamilyMemberTesting {
	public static void main(String[] args) {
		
		System.out.println("# COMMON FUND OF THE FAMILY");
		System.out.println("The " + FamilyMember.familyName + " family has $" + FamilyMember.commonFund);
		System.out.println("----------------------------------------------- \n");
		
		FamilyMember[] arrayFamily = new FamilyMember[4];
		arrayFamily[0] = new FamilyMember("John", 254639.12);
		arrayFamily[1] = new FamilyMember("Erika", 187346.56);
		arrayFamily[2] = new FamilyMember("James", 56783.12);
		arrayFamily[3] = new FamilyMember("Paris", 12124.88);

		System.out.println("# PRIVATE FUND");
		arrayFamily[0].printPrivateFund();
		arrayFamily[1].printPrivateFund();
		arrayFamily[2].printPrivateFund();
		arrayFamily[3].printPrivateFund();
		System.out.println("----------------------------------------------- \n");


		arrayFamily[1].contributeToCommonFund(10000); //Erika
		arrayFamily[3].contributeToCommonFund(10000); //Paris
		
		System.out.println("# CONTRIBUTION OF PRIVATE FUND");
		arrayFamily[0].printPrivateFund();
		arrayFamily[1].printPrivateFund();
		arrayFamily[2].printPrivateFund();
		arrayFamily[3].printPrivateFund();
		System.out.println("----------------------------------------------- \n");
		
		System.out.println("# UPDATED COMMON FUND OF THE FAMILY");
		FamilyMember.printFamilyFund();
		System.out.println("----------------------------------------------- \n");
	}
}