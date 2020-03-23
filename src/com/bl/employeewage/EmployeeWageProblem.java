package com.bl.employeewage;

public class EmployeeWageProblem {

    private static final int IS_FULLTIME = 1;
    private static final int IS_PARTTIME = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static int empHours = 0;
    private static int salary = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 3);

        switch (attendanceCheck) {
            case IS_FULLTIME:
                System.out.println("Employee is Full Time");
                empHours = 8;
                break;
            case IS_PARTTIME:
                System.out.println("Employee is Part Time");
                empHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }
        salary = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Salary:-" + salary);
    }
}