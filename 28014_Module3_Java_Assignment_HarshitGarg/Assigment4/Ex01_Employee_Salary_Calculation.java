import java.util.*;

public class Ex01_Employee_Salary_Calculation {
        private int employeeId;
        private String employeeName;
        private double basicSalary;
        private double hra;
        private double da;
        private double grossSalary;

        void read() {
            try (Scanner sc = new Scanner(System.in)) {

                System.out.print("Enter Employee ID: ");
                employeeId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                employeeName = sc.nextLine();

                System.out.print("Enter Basic Salary: ");
                basicSalary = sc.nextDouble();

                System.out.print("Enter HRA: ");
                hra = sc.nextDouble();

                System.out.print("Enter DA: ");
                da = sc.nextDouble();
            }
        }

        double calculateSalary() {
            grossSalary = basicSalary + hra + da;
            return grossSalary;
        }

        void display() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Gross Salary: " + calculateSalary());
        }

    public static void main(String[] args) {
        Ex01_Employee_Salary_Calculation employee = new Ex01_Employee_Salary_Calculation();
        employee.read();
        employee.calculateSalary();
        employee.display();
    }
}
