import java.util.Scanner;

public class Ex06_EmployeeSalary {

    static double calculateSalary(double basicSalary) {

        double hra;

        if (basicSalary >= 50000) {
            hra = basicSalary * 20 / 100;
        } else {
            hra = basicSalary * 10 / 100;
        }

        double finalSalary = basicSalary + hra;

        return finalSalary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double finalSalary = calculateSalary(basicSalary);

        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("Final Salary: Rs. " + finalSalary);

        sc.close();
    }
}