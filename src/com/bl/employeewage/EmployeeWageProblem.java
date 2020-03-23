package com.bl.employeewage;

public class EmployeeWageProblem {


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int TOTAL_DAYS = 20;
        final int MAX_HOURS = 100;

        int totalSalary = 0, noOfDay = 0, totalEmpHours = 0;

        while (noOfDay < TOTAL_DAYS && totalEmpHours < MAX_HOURS) {
            int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 3);
            int empHours = 0, salary = 0;
            switch (attendanceCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    empHours = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
            noOfDay += 1;
            salary = empHours * WAGE_PER_HOUR;
            totalEmpHours += empHours;
            totalSalary += salary;
            System.out.println("Employee Salary:-" + salary + " of the Day:-" + noOfDay);
        }
        System.out.println("Employee Salary Of Month:-" + totalSalary);
    }
}
