abstract class Vehicle {
    protected String vehicleNo;
    protected String brand;
    protected double rentalRate;

    public Vehicle(String vehicleNo, String brand, double rentalRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Rate: ₹" + rentalRate);
    }

    public abstract double calculateRental(int days);
}

class Car extends Vehicle {
    private int numberOfSeats;
    private double insuranceCharge;

    public Car(String vehicleNo, String brand, double rentalRate,
               int numberOfSeats, double insuranceCharge) {
        super(vehicleNo, brand, rentalRate);
        this.numberOfSeats = numberOfSeats;
        this.insuranceCharge = insuranceCharge;
    }

    @Override
    public double calculateRental(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Days must be positive.");
        }
        return rentalRate * days + insuranceCharge;
    }

    public void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Insurance Charge: ₹" + insuranceCharge);
    }
}

public class Ex01_VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("HR06AB1234", "Hyundai", 1500, 5, 500);
        int days = 3;

        car.displayCarDetails();
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rental: ₹" + car.calculateRental(days));
    }
}
