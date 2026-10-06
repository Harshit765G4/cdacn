import java.util.Scanner;

public class ElectricityBill{
    long customerNumber; String customerName; int units;

    void read() {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Employee ID: ");
            customerNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            customerName = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            units = sc.nextInt();
        }
    }

    void calculateBill() {
        int unitsConsumedCost;          
        if(units <= 100){
            unitsConsumedCost = units * 2;
        } else {

        }
    }

    void display() {

    }
}