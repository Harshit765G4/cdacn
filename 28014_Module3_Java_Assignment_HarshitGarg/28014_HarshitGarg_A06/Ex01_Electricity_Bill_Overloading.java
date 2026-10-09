import java.util.Scanner;

class ElectricityBill {

    int consumerNo;
    String consumerName;
    int unitsConsumed;

    ElectricityBill(int consumerNo, String consumerName,
                    int unitsConsumed) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Default rate: Rs. 8 per unit
    double calculateBill() {
        return unitsConsumed * 8.0;
    }

    // Given rate and stored units
    double calculateBill(double rate) {
        return unitsConsumed * rate;
    }

    // Given rate and specified units
    double calculateBill(double rate, int units) {
        return rate * units;
    }

    void display() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);

        System.out.printf("Bill at default rate: Rs. %.2f%n",
                          calculateBill());

        System.out.printf("Bill at given rate: Rs. %.2f%n",
                          calculateBill(10.0));

        System.out.printf("Bill at given rate and units: Rs. %.2f%n",
                          calculateBill(12.0, 50));
    }
}

public class Ex01_Electricity_Bill_Overloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityBill bill =
                new ElectricityBill(number, name, units);

        bill.display();

        sc.close();
    }
}