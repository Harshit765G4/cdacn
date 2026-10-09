import java.util.Scanner;

public class Ex01_Employee_Salary_calculation {

    int employeeId;
    String employeeName;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    Scanner sc = new Scanner(System.in);

    void read() {
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

    void calculateSalary() {
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        Ex01_Employee_Salary_calculation emp =
                new Ex01_Employee_Salary_calculation();

        emp.read();
        emp.calculateSalary();
        emp.display();
    }
}
