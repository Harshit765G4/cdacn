import java.util.Scanner;

public class Ex09_BusTicketFare {

    static double calculateFare(int age) {

        double fare;

        if (age < 5) {
            fare = 0;
        } else if (age <= 12) {
            fare = 20;
        } else if (age <= 59) {
            fare = 40;
        } else {
            fare = 25;
        }

        return fare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        double fare = calculateFare(age);

        System.out.println("\n--- Bus Ticket Details ---");
        System.out.println("Passenger Name: " + name);
        System.out.println("Age: " + age);

        if (fare == 0) {
            System.out.println("Fare: Free");
        } else {
            System.out.println("Fare: Rs. " + fare);
        }

        sc.close();
    }
}