
public class PartTime extends Employee implements TaxPayer {

	String workplace;
	double numHrPerWeek;
	double hourlyRate;
	
	PartTime(String name, String position, String workplace, double numHrPerWeek, double hourlyRate){
		super(name, position);
		this.workplace = workplace;
		this.numHrPerWeek = numHrPerWeek;
		this.hourlyRate = hourlyRate;
	}
	
	void printWorkPlace() {
		System.out.println("Work at " + workplace);
	}
	
	double calculateMonthlyIncome() {
		return numHrPerWeek*hourlyRate*4;
	}
	
	public double calculateYearlyIncome() {
		return calculateMonthlyIncome()*12;
	}
	
	public double calculateTax() {
		return calculateYearlyIncome()*calculateTaxRate(calculateYearlyIncome());
	}
	
	public void payTax() 
	{
		System.out.println("Pay tax $"+ calculateTax());
	}
	
	public void printInfo() 
	{
		System.out.println(name + "is a "+ position);
		System.out.println("Work at "+ workplace);
		System.out.println("Yearly income is "+ calculateYearlyIncome());
		payTax();
	}
}
