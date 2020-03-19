
public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int salary = 0;

        int attendanceCheck = (int) (Math.floor(Math.random() * 10) % 2);
        if (attendanceCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            salary = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee Wage:- " + salary);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee Wage:- " + salary);
        }
    }
}
