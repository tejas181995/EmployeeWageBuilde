public class EmpWageBuilder{
    public static void main(String []args){
        System.out.println("Welcome to Employee Wage");
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if(empcheck == 1 ){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }

    }
}
