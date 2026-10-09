import java.util.Scanner;

public class Ex03_Product_Billing {

    int productId;
    String productName;
    double price;
    int quantity;
    double totalAmount;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    void calculateBill() {
        totalAmount = price * quantity;
    }

    void display() {
        System.out.println("\n----- Product Bill -----");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Amount: %.2f%n", totalAmount);
    }

    public static void main(String[] args) {
        Ex03_Product_Billing product =
                new Ex03_Product_Billing();

        product.read();
        product.calculateBill();
        product.display();
    }
}
