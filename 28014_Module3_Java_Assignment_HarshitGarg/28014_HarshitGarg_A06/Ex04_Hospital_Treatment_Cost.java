import java.util.Scanner;

class Patient {

    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    double calculateTreatmentCost() {
        return 1000.0;
    }

    void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.printf("Treatment Cost: Rs. %.2f%n",
                          calculateTreatmentCost());
    }
}

class InPatient extends Patient {

    int numberOfDays;
    double roomCharge;

    InPatient(int id, String name, int age,
              int numberOfDays, double roomCharge) {
        super(id, name, age);
        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    @Override
    double calculateTreatmentCost() {
        return 1000.0 + numberOfDays * roomCharge;
    }

    @Override
    void displayPatientDetails() {
        super.displayPatientDetails();
        System.out.println("Number of Days: " + numberOfDays);
        System.out.printf("Room Charge per Day: Rs. %.2f%n", roomCharge);
    }
}

class OutPatient extends Patient {

    double consultationFee;
    double medicineCost;

    OutPatient(int id, String name, int age,
               double consultationFee, double medicineCost) {
        super(id, name, age);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    double calculateTreatmentCost() {
        return 1000.0 + consultationFee + medicineCost;
    }

    @Override
    void displayPatientDetails() {
        super.displayPatientDetails();
        System.out.printf("Consultation Fee: Rs. %.2f%n", consultationFee);
        System.out.printf("Medicine Cost: Rs. %.2f%n", medicineCost);
    }
}

public class Ex04_Hospital_Treatment_Cost {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- InPatient Details ---");

        System.out.print("Enter Patient ID: ");
        int inId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String inName = sc.nextLine();

        System.out.print("Enter Age: ");
        int inAge = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        System.out.print("Enter Room Charge per Day: ");
        double roomCharge = sc.nextDouble();

        InPatient inPatient = new InPatient(
            inId, inName, inAge, days, roomCharge
        );

        System.out.println("\nInPatient Details:");
        inPatient.displayPatientDetails();

        sc.nextLine();

        System.out.println("\n--- OutPatient Details ---");

        System.out.print("Enter Patient ID: ");
        int outId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String outName = sc.nextLine();

        System.out.print("Enter Age: ");
        int outAge = sc.nextInt();

        System.out.print("Enter Consultation Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter Medicine Cost: ");
        double medicine = sc.nextDouble();

        OutPatient outPatient = new OutPatient(
            outId, outName, outAge, fee, medicine
        );

        System.out.println("\nOutPatient Details:");
        outPatient.displayPatientDetails();

        sc.close();
    }
}