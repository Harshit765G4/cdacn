import java.util.Scanner;

public class Ex10_MobileDataUsage {

    static double calculateCharge(double dataUsed) {

        double charge;

        if (dataUsed <= 1) {
            charge = 50;
        } else if (dataUsed <= 5) {
            charge = 100;
        } else if (dataUsed <= 10) {
            charge = 200;
        } else {
            charge = 350;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter data used in GB: ");
        double dataUsed = sc.nextDouble();

        double charge = calculateCharge(dataUsed);

        System.out.println("\n--- Mobile Data Details ---");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Data Used: " + dataUsed + " GB");
        System.out.println("Final Charge: Rs. " + charge);

        sc.close();
    }
}