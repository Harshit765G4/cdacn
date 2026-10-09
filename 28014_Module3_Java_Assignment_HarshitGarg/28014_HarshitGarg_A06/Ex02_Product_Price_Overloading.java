import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Price of one product
    double calculatePrice() {
        return price;
    }

    // Price for multiple products
    double calculatePrice(int quantity) {
        return price * quantity;
    }

    // Total price after discount
    double calculatePrice(int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    void display(int quantity, double discount) {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price of One Product: Rs. %.2f%n",
                          calculatePrice());
        System.out.printf("Total Price: Rs. %.2f%n",
                          calculatePrice(quantity));
        System.out.printf("Final Price after %.2f%% Discount: Rs. %.2f%n",
                          discount, calculatePrice(quantity, discount));
    }
}

public class Ex02_Product_Price_Overloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price of One Product: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        if (price < 0 || quantity <= 0 ||
            discount < 0 || discount > 100) {
            System.out.println("Invalid price, quantity, or discount.");
        } else {
            Product product = new Product(id, name, price);
            product.display(quantity, discount);
        }

        sc.close();
    }
}