public class EmpWageBuilder{
    public static void main(String []args){
        System.out.println("Welcome to Employee Wage");
        int IS_FULL_TIME = 1;
        int FULL_TIME_HRS = 8;
        int WAGE_PER_HR = 20;
        int DAILY_WAGE;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if(empcheck == 1 ){
            System.out.println("Employee is present");
            DAILY_WAGE = FULL_TIME_HRS * WAGE_PER_HR;
            System.out.println("Employee's daily wage is: " + DAILY_WAGE);
        }else{
            System.out.println("Employee is absent");
        }

    }
}
