import java.util.Scanner;

public class Ex04_Electricity_Bill_Calculation {

    long consumerNumber;
    String consumerName;
    int units;
    double billAmount;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Consumer Number: ");
        consumerNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();
    }

    void calculateBill() {
        if (units < 0) {
            billAmount = -1;
        } else if (units <= 100) {
            billAmount = units * 2;
        } else if (units <= 200) {
            billAmount = (100 * 2)
                       + (units - 100) * 3;
        } else {
            billAmount = (100 * 2)
                       + (100 * 3)
                       + (units - 200) * 5;
        }
    }

    void display() {
        if (billAmount < 0) {
            System.out.println("Invalid units consumed.");
            return;
        }

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + units);
        System.out.printf("Bill Amount: Rs. %.2f%n", billAmount);
    }

    public static void main(String[] args) {
        Ex04_Electricity_Bill_Calculation bill =
                new Ex04_Electricity_Bill_Calculation();

        bill.read();
        bill.calculateBill();
        bill.display();
    }
}