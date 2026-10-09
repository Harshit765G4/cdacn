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

    double calculateDiscount() {
        return 0;
    }

    void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: %.2f%n", price);
    }
}

class Electronics extends Product {

    String brand;
    int warranty;

    Electronics(int id, String name, double price,
                String brand, int warranty) {
        super(id, name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void displayElectronicsDetails() {
        displayProductDetails();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " years");
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Price: %.2f%n", calculateFinalPrice());
    }
}

class Clothing extends Product {

    String size;
    String material;

    Clothing(int id, String name, double price,
             String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void displayClothingDetails() {
        displayProductDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Price: %.2f%n", calculateFinalPrice());
    }
}

public class Ex04_Product_Specialized_Products {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Electronics ---");

        System.out.print("Enter Product ID: ");
        int eId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String eName = sc.nextLine();

        System.out.print("Enter Price: ");
        double ePrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Warranty (years): ");
        int warranty = sc.nextInt();
        sc.nextLine();

        Electronics electronics = new Electronics(
            eId, eName, ePrice, brand, warranty
        );

        System.out.println("\nElectronics Details:");
        electronics.displayElectronicsDetails();

        System.out.println("\n--- Clothing ---");

        System.out.print("Enter Product ID: ");
        int cId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String cName = sc.nextLine();

        System.out.print("Enter Price: ");
        double cPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Size: ");
        String size = sc.nextLine();

        System.out.print("Enter Material: ");
        String material = sc.nextLine();

        Clothing clothing = new Clothing(
            cId, cName, cPrice, size, material
        );

        System.out.println("\nClothing Details:");
        clothing.displayClothingDetails();

        sc.close();
    }
}