package com.bl.employeewage;

public class EmployeeWageProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //  int totalSalary=0;
        final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int workingOfDay = 20;
        int empHours = 0, salary = 0;
        int totalSalary = 0;

        for (int day = 1; day <= workingOfDay; day++) {
            int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println(attendanceCheck);
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
            salary = empHours * WAGE_PER_HOUR;
            System.out.println("Employee Salary:-" + salary);
            totalSalary += salary;
        }
        System.out.println("Employee Salary Of Month:-" + totalSalary);
    }
}
