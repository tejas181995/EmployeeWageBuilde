class Employee{
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
}
class EmpWageBuilder{
    public static final int EMP_WAGE_PER_HR = 20;
    public static final int EMP_PART_TIME_HRS = 4;
    public static final int EMP_FULL_TIME_HRS = 8;

    public static final int EMP_ABSENT = 0;
    public static final int EMP_FULL_TIME = 1;
    public static final int EMP_PART_TIME= 2;

    public static void main(String[] args) {
        int dailyWage = 0, totalWage = 0, dayCount = 0, hourCount = 0, maxHours = 100, maxDays = 20;
        Employee employee = new Employee();
        while(dayCount < maxDays || hourCount < maxHours){
             switch(employee.getEmpStatus()){
                    case EMP_ABSENT:
                        System.out.println("Employee is absent");
                        break;
                    case EMP_FULL_TIME:
                        dailyWage = employee.getDailyWage(EMP_WAGE_PER_HR, EMP_FULL_TIME_HRS);
                        System.out.println("daily wage of full time employee: " + dailyWage);
                        hourCount = employee.increamentWorkingHrs(EMP_FULL_TIME_HRS);
                        break;
                    case EMP_PART_TIME:
                        dailyWage= employee.getDailyWage(EMP_WAGE_PER_HR, EMP_PART_TIME_HRS);
                        System.out.println("daily wage of part time employee: " + dailyWage);
                        hourCount = employee.increamentWorkingHrs(EMP_PART_TIME_HRS);
                        break;
                }
                totalWage = employee.increamentWage(dailyWage);
                dayCount++;
       
        }
        System.out.println("total wage of employee is: " + totalWage);
    }
}

