import java.util.Scanner;

class Vehicle {

    String vehicleNo;
    String brand;
    double price;

    Vehicle(String vehicleNo, String brand, double price) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.price = price;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.printf("Price: %.2f%n", price);
    }

    double calculateTax() {
        return price * 0.10;
    }
}

class Car extends Vehicle {

    String model;
    String fuelType;

    Car(String vehicleNo, String brand, double price,
        String model, String fuelType) {

        super(vehicleNo, brand, price);
        this.model = model;
        this.fuelType = fuelType;
    }

    void displayCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }

    double calculateInsurance() {
        return price * 0.02;
    }
}

class ElectricCar extends Car {

    double batteryCapacity;
    double chargingTime;

    ElectricCar(String vehicleNo, String brand, double price,
                String model, String fuelType,
                double batteryCapacity, double chargingTime) {

        super(vehicleNo, brand, price, model, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    double calculateRange() {
        return batteryCapacity * 5;
    }

    void displayElectricCarDetails() {
        displayVehicleDetails();
        displayCarDetails();

        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.printf("Tax: %.2f%n", calculateTax());
        System.out.printf("Insurance: %.2f%n", calculateInsurance());
        System.out.printf("Estimated Range: %.2f km%n", calculateRange());
    }
}

public class Ex02_Vehicle_Car_ElectricCar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuelType = sc.nextLine();

        System.out.print("Enter Battery Capacity (kWh): ");
        double battery = sc.nextDouble();

        System.out.print("Enter Charging Time (hours): ");
        double chargingTime = sc.nextDouble();

        ElectricCar car = new ElectricCar(
            vehicleNo, brand, price, model, fuelType,
            battery, chargingTime
        );

        System.out.println("\n--- Electric Car Details ---");
        car.displayElectricCarDetails();

        sc.close();
    }
}