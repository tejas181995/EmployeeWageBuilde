class CompanyEmpWage {

	public final String companyName;
	public final int empWagePerHr;
	public final int daysInMonth;
	public final int maxHrs;
	public int totalEmpWage;


	public CompanyEmpWage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs) {

		this.companyName = companyName;
		this.empWagePerHr = empWagePerHr;
		this.daysInMonth = daysInMonth;
		this.maxHrs = maxHrs;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString(){
		return "Total Emp Wage for Company: " + companyName + " is: " + totalEmpWage;
	}
}

public class EmpWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWage() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyWage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empWagePerHr, daysInMonth, maxHrs);
		numOfCompany++;
	}

	private void computeWage() {
		for (int i=0; i<numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public int computeWage(CompanyEmpWage companyEmpWage){

		
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int empHrs = 0;
		int empWage = 0;

		
		while ( totalWorkingDays < companyEmpWage.daysInMonth && totalEmpHrs <= companyEmpWage.maxHrs ) {

			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			if (empCheck == IS_FULL_TIME) {
				empHrs = 8;
			}else if (empCheck == IS_PART_TIME) {
				empHrs = 4;
			}else {
				empHrs = 0;
			}
			totalWorkingDays ++;
			empWage = empHrs * companyEmpWage.empWagePerHr;
			totalEmpHrs += empHrs;
			System.out.println("Employee day: " + totalWorkingDays + " Emp Hr: " + empHrs + " Wage: "+empWage);
		}
		return totalEmpHrs * companyEmpWage.empWagePerHr;
	}

	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation ");

			EmpWage empwage = new EmpWage();

			empwage.addCompanyWage("Dmart", 20, 10, 50);
			empwage.addCompanyWage("BigBazaar", 25, 14, 40);
			empwage.addCompanyWage("VishalMegaMart", 20, 12, 40);
			empwage.computeWage();
	}
}
