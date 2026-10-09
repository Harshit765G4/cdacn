import java.util.Scanner;

class Vehicle {

    String vehicleNo;
    String brand;
    double baseRate;

    Vehicle(String vehicleNo, String brand, double baseRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    double calculateRental() {
        return baseRate;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.printf("Base Rate per Day: Rs. %.2f%n", baseRate);
        System.out.printf("Rental Amount: Rs. %.2f%n",
                          calculateRental());
    }
}

class Car extends Vehicle {

    int numberOfDays;
    double insuranceCharge;

    Car(String vehicleNo, String brand, double baseRate,
        int numberOfDays, double insuranceCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.insuranceCharge = insuranceCharge;
    }

    @Override
    double calculateRental() {
        return baseRate * numberOfDays + insuranceCharge;
    }

    @Override
    void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Number of Days: " + numberOfDays);
        System.out.printf("Insurance Charge: Rs. %.2f%n",
                          insuranceCharge);
    }
}

class Bike extends Vehicle {

    int numberOfDays;
    double helmetCharge;

    Bike(String vehicleNo, String brand, double baseRate,
         int numberOfDays, double helmetCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.helmetCharge = helmetCharge;
    }

    @Override
    double calculateRental() {
        return baseRate * numberOfDays + helmetCharge;
    }

    @Override
    void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Number of Days: " + numberOfDays);
        System.out.printf("Helmet Charge: Rs. %.2f%n",
                          helmetCharge);
    }
}

public class Ex05_Vehicle_Rental_Charge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Car Rental ---");

        System.out.print("Enter Vehicle Number: ");
        String carNo = sc.nextLine();

        System.out.print("Enter Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Enter Base Rate per Day: ");
        double carRate = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int carDays = sc.nextInt();

        System.out.print("Enter Insurance Charge: ");
        double insurance = sc.nextDouble();

        Car car = new Car(
            carNo, carBrand, carRate, carDays, insurance
        );

        System.out.println("\nCar Details:");
        car.displayVehicleDetails();

        sc.nextLine();

        System.out.println("\n--- Bike Rental ---");

        System.out.print("Enter Vehicle Number: ");
        String bikeNo = sc.nextLine();

        System.out.print("Enter Brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Enter Base Rate per Day: ");
        double bikeRate = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int bikeDays = sc.nextInt();

        System.out.print("Enter Helmet Charge: ");
        double helmet = sc.nextDouble();

        Bike bike = new Bike(
            bikeNo, bikeBrand, bikeRate, bikeDays, helmet
        );

        System.out.println("\nBike Details:");
        bike.displayVehicleDetails();

        sc.close();
    }
}