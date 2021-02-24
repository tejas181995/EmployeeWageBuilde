class Employee{ 
    public final int EMP_WAGE_PER_HR = 20;
    public final int EMP_FULL_TIME_HRS = 8;
    public final int EMP_PART_TIME_HRS = 4; 
    int empWagePerHr, dailyWage, totalWage, totalWorkingHrs, empStatus;

    public int getEmpStatus(){
        return (int) (Math.floor(Math.random() * 10) % 3);
    }
    public int getDailyWage(int empWagePerHr, int workingHrs){
        return empWagePerHr * workingHrs;
    }
    public int increamentWage(int increament){
        this.totalWage += increament;
        return this.totalWage;
    }
    public int increamentWorkingHrs(int increament){
        this.totalWorkingHrs += increament;
        return this.totalWorkingHrs;
    }
    public  void getInfo() {
        System.out.println("employee");
    }
}
class RelianceEmployee extends Employee{
    public final int EMP_WAGE_PER_HR = 20;
    public final int EMP_FULL_TIME_HRS = 12;
    public final int EMP_PART_TIME_HRS = 6; 
    public  void getInfo() {
        System.out.println("Reliance employee");
    }

}
class DmartEmployee extends Employee{
    public final int EMP_WAGE_PER_HR = 30;
    public final int EMP_FULL_TIME_HRS = 8;
    public final int EMP_PART_TIME_HRS = 4; 
    public  void getInfo() {
        System.out.println("dmart employee");
    }
}

class EmpWageBuilder{

    public static final int EMP_ABSENT = 0;
    public static final int EMP_FULL_TIME = 1;
    public static final int EMP_PART_TIME= 2;

    public static void calculateTotalWage(Employee employee) {
        System.out.println("------------------------------------------------");
        employee.getInfo();
        System.out.println("------------------------------------------------");
        int dailyWage = 0, totalWage = 0, dayCount = 0, hourCount = 0, maxHours = 100, maxDays = 20;
          while(dayCount < maxDays || hourCount < maxHours){
             switch(employee.getEmpStatus()){
                    case EMP_ABSENT:
                        System.out.println("Employee is absent");
                        break;
                    case EMP_FULL_TIME:
                        dailyWage = employee.getDailyWage(employee.EMP_WAGE_PER_HR, employee.EMP_FULL_TIME_HRS);
                        System.out.println("daily wage of full time employee: " + dailyWage);
                        hourCount = employee.increamentWorkingHrs(employee.EMP_FULL_TIME_HRS);
                        break;
                    case EMP_PART_TIME:
                        dailyWage= employee.getDailyWage(employee.EMP_WAGE_PER_HR, employee.EMP_PART_TIME_HRS);
                        System.out.println("daily wage of part time employee: " + dailyWage);
                        hourCount = employee.increamentWorkingHrs(employee.EMP_PART_TIME_HRS);
                        break;
                }
                totalWage = employee.increamentWage(dailyWage);
                dayCount++;
       
        }
        System.out.println("total wage of employee is: " + totalWage);
    }
    public static void main(String[] args) {
       
        Employee employee1 = new RelianceEmployee();
        calculateTotalWage(employee1);
        Employee employee2 = new DmartEmployee();
        calculateTotalWage(employee2);

    
    }
}

