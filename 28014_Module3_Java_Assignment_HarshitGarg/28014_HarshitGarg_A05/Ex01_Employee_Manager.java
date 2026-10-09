import java.util.Scanner;

class Employee {

    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Basic Salary: %.2f%n", basicSalary);
    }
}

class Manager extends Employee {

    String department;
    double bonus;

    Manager(int employeeId, String employeeName, double basicSalary,
            String department, double bonus) {

        super(employeeId, employeeName, basicSalary);
        this.department = department;
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return calculateSalary() + bonus;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.printf("Bonus: %.2f%n", bonus);
        System.out.printf("Total Salary: %.2f%n", calculateTotalSalary());
    }
}

public class Ex01_Employee_Manager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        Manager manager = new Manager(id, name, salary, department, bonus);

        System.out.println("\n--- Manager Details ---");
        manager.displayManagerDetails();

        sc.close();
    }
}