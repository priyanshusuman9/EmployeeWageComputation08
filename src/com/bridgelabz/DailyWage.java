package com.bridgelabz;

public class DailyWage {

    void calDailyWage() {  // By  creating non static method in the same class
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;
        int employeeCheck = (int) Math.floor(Math.random()*10)%2;
        if (employeeCheck==1){
            dailyWage = wagePerHour*fullDayHour;
            System.out.println("dailyWage is " + dailyWage);
        }
        else {
            System.out.println("Employee is Absent Daily wage is " + dailyWage);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");
        DailyWage d=new DailyWage(); // access non static method by creating class
        d.calDailyWage(); // non static method call by referenceName.MethodName
    }
}


