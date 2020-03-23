package com.bl.employeewage;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");


        int WAGE_PER_HOUR = 20;
        int salary = 0, empHours = 0;
        int IS_FULLTIME = 1, IS_PARTTIME = 2;

        int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 3);

        if (attendanceCheck == IS_FULLTIME) {
            System.out.println("Employee is Full Time");
            empHours = 8;
        } else {
            if (attendanceCheck == IS_PARTTIME) {
                System.out.println("Employee is Part Time");
                empHours = 4;
            } else {
                System.out.println("Employee is Absent");
            }
        }
        salary = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Salary:=" + salary);
    }
}
