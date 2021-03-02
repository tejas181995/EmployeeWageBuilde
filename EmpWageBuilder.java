public class EmpWage {

	//Constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	//Variables
	private final String companyName;
	private final int empWagePerHr;
	private final int daysInMonth;
	private final int maxHrs;
	private final int empHrsFullTime;
	private final int empHrsPartTime;
	private int totalEmpWage;


	public EmpWage(String companyName, int empWagePerHr, int daysInMonth, int maxHrs, int empHrsFullTime, int empHrsPartTime) {

		this.companyName = companyName;
		this.empWagePerHr = empWagePerHr;
		this.daysInMonth = daysInMonth;
		this.maxHrs = maxHrs;
		this.empHrsFullTime = empHrsFullTime;
		this.empHrsPartTime = empHrsPartTime;

	}

	public void computeWage() {

		//Variables
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int empHrs = 0;
		int empWage = 0;

		//Computation
		while ( totalWorkingDays < daysInMonth && totalEmpHrs <= maxHrs ) {

			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			if (empCheck == IS_FULL_TIME) {
				empHrs = empHrsFullTime;
			}else if (empCheck == IS_PART_TIME) {
				empHrs = empHrsPartTime;
			}else {
				empHrs = 0;
			}
			totalWorkingDays ++;
			empWage = empHrs * empWagePerHr;
			totalEmpHrs += empHrs;
			totalEmpWage += empWage;
			System.out.println("Employee day: " + totalWorkingDays + " Emp Hr: " + empHrs + " Wage: "+empWage);
		}

	}

	public String toString(){
		return "Total Emp Wage for Company: " + companyName + " is: " + totalEmpWage ;
	}



	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation ");
 		EmpWage Dmart = new EmpWage("Dmart", 20, 10, 50, 10, 5);
		EmpWage BigBazaar = new EmpWage("BigBazaar", 25, 14, 40, 12, 6);
		EmpWage VishalMegaMart = new EmpWage("VishalMegaMart", 20, 12, 40, 8, 4);

		System.out.println("Employee of Dmart");
		Dmart.computeWage();
		System.out.println(Dmart);

		System.out.println("Employee of BigBazaar");
		BigBazaar.computeWage();
		System.out.println(BigBazaar);

		System.out.println("Employee of Vishal Mega Mart");
		VishalMegaMart.computeWage();
		System.out.println(VishalMegaMart);

	}
}
