import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void read(Scanner sc) {
        System.out.print("Enter product ID: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        productName = sc.nextLine();

        System.out.print("Enter product price: ");
        price = sc.nextDouble();

        if (price < 0) {
            throw new IllegalArgumentException(
                "Price cannot be negative."
            );
        }
    }

    public void display() {
        System.out.println(
            "ID: " + productId
            + ", Name: " + productName
            + ", Price: ₹" + price
        );
    }

    public double getPrice() {
        return price;
    }
}

public class Ex04_ProductArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("\nProduct " + i);

                Product p = new Product(0, "", 0);
                p.read(sc);
                products.add(p);
            }

            double totalPrice = 0;
            Product highest = products.get(0);

            System.out.println("\n=== Product Details ===");

            for (Product p : products) {
                p.display();
                totalPrice += p.getPrice();

                if (p.getPrice() > highest.getPrice()) {
                    highest = p;
                }
            }

            System.out.println(
                "\nTotal Price: ₹" + totalPrice
            );

            System.out.println("\n=== Highest-Priced Product ===");
            highest.display();

        } catch (InputMismatchException e) {
            System.out.println(
                "Invalid input. Enter numeric values for ID and price."
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
