
public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT=1;

        int attendanceCheck= (int) (Math.floor(Math.random()*10)%2);
        if (attendanceCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else System.out.println("Employee is Absent");
    }
}
