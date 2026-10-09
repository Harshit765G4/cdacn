import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private int unitsConsumed;
    private double billAmount;

    public ElectricityBill(String consumerNo, String consumerName) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
    }

    public void readDetails(Scanner sc) {
        System.out.print("Enter units consumed: ");
        unitsConsumed = sc.nextInt();

        if (unitsConsumed < 0) {
            throw new IllegalArgumentException(
                "Units cannot be negative."
            );
        }
    }

    public void calculateBill() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 3.0;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 3.0
                       + (unitsConsumed - 100) * 5.0;
        } else {
            billAmount = 100 * 3.0 + 100 * 5.0
                       + (unitsConsumed - 200) * 8.0;
        }
    }

    public void displayBill() {
        System.out.println("\n=== Electricity Bill ===");
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: ₹" + billAmount);
    }
}

public class Ex03_ElectricityBillProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBill bill =
            new ElectricityBill("C101", "Sample Consumer");

        try {
            bill.readDetails(sc);
            bill.calculateBill();
            bill.displayBill();
        } catch (InputMismatchException e) {
            System.out.println(
                "Invalid input. Enter units as a whole number."
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid units: " + e.getMessage());
        } finally {
            System.out.println(
                "Electricity bill processing completed."
            );
            sc.close();
        }
    }
}
