public class EmpWageBuilder{
    public static void main(String []args){
        System.out.println("Welcome to Employee Wage");
        int FULL_TIME_HRS = 8;
        int PART_TIME_HRS = 4;
        int WAGE_PER_HR = 20;
        int DAYS_OF_MONTH = 20;
        int DAY_COUNT = 0;
        int HOUR_COUNT = 0;
        int MONTHLY_WAGE = 0;
        int DAILY_WAGE;

        while((DAY_COUNT <= DAYS_OF_MONTH) || (HOUR_COUNT <= 100) ){
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        
        switch(empCheck) {
            case 1:
                System.out.println("Employee is full time");
                DAILY_WAGE = FULL_TIME_HRS * WAGE_PER_HR;
                MONTHLY_WAGE += DAILY_WAGE ;
                DAY_COUNT += 1;
                HOUR_COUNT += FULL_TIME_HRS;
                break;
            case 2:
                System.out.println("Empoyee is part time");
                DAILY_WAGE = PART_TIME_HRS * WAGE_PER_HR;
                MONTHLY_WAGE += DAILY_WAGE; 
                DAY_COUNT += 1;
                HOUR_COUNT += PART_TIME_HRS;
                break;
            default:
                System.out.println("Employee is absent");
                break;

               }
            }
            System.out.println("Monthly wage is: " + MONTHLY_WAGE);

    }
}
