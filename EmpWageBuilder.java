public class EmpWageBuilder{
    public static void main(String []args){
        System.out.println("Welcome to Employee Wage");
        int FULL_TIME_HRS = 8;
        int PART_TIME_HRS = 4;
        int WAGE_PER_HR = 20;
        int DAILY_WAGE;
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        
        switch(empCheck) {
            case 1:
                System.out.println("Employee is full time");
                DAILY_WAGE = FULL_TIME_HRS * WAGE_PER_HR;
                System.out.println("Daily wage is: " + DAILY_WAGE);
                break;
            case 2:
                System.out.println("Empoyee is part time");
                DAILY_WAGE = PART_TIME_HRS * WAGE_PER_HR;
                System.out.println("Daily wage is: " + DAILY_WAGE);
                break;
            default:
                System.out.println("Employee is absent");
                break;
    }
}
