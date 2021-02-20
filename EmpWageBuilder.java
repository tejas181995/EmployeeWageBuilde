public class EmpWageBuilder{
    public static void main(String []args){
        System.out.println("Welcome to Employee Wage");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int FULL_TIME_HRS = 8;
        int PART_TIME_HRS = 4;
        int WAGE_PER_HR = 20;
        int DAILY_WAGE;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if(empcheck == 1 ){
            System.out.println("Employee is full time");
            DAILY_WAGE = FULL_TIME_HRS * WAGE_PER_HR;
            System.out.println("Employee's daily wage is: " + DAILY_WAGE);
        }else if(empcheck == 2){
            System.out.println("Employee is part time");
            DAILY_WAGE = PART_TIME_HRS * WAGE_PER_HR;
            System.out.println("employee's daily wage is: " + DAILY_WAGE);
        }else{
            System.out.println("Employee is absent");
        }

    }
}
