package com.bl.employeewage;

public class EmployeeWageProblem {


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //  int totalSalary=0;
        final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int workingOfDay = 20;
        final int maxHours = 100;

        int totalSalary = 0;
        int noOfDay = 0, totalEmpHours = 0;

        while (noOfDay < workingOfDay && totalEmpHours < maxHours) {
            int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 3);

            System.out.println(attendanceCheck);
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
            System.out.println("Employee Salary:-" + salary+" of the Day:-"+noOfDay);
        }
        System.out.println("Employee Salary Of Month:-" + totalSalary);
    }
}
