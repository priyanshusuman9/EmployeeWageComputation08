package com.bridgelabz;

public class WagesForAMonth {

    void CountWageForAMonth(){
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeWage = 4;
        int workingDays= 20;
        int dailyWage = 0;
        int employeeCheck = (int)(Math.random() * ((2 + 0) + 1));
        for (int day =0; day<workingDays; day++){
            switch (employeeCheck){
                case 1:
                    dailyWage= dailyWage+fullDayHour*wagePerHour;
                    System.out.println("Employeee Full Time Wage is "+ " "+ dailyWage);
                    break;
                case 2:
                    dailyWage=dailyWage+partTimeWage*wagePerHour;
                    System.out.println("Employee Part Time Wage is " + " "+ dailyWage);
                    break;
                default:
                    System.out.println("Employee is Absent Daily Wage is " + " " + dailyWage);
            }
        }
        System.out.println("Employee Wages for a month " + " " + dailyWage);
    }
    public static void main(String[] args) {
        WagesForAMonth w=new WagesForAMonth();
        w.CountWageForAMonth();
    }
}
