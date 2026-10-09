import java.util.Scanner;

class Person {

    int personId;
    String personName;
    int age;

    Person(int personId, String personName, int age) {
        this.personId = personId;
        this.personName = personName;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Person Name: " + personName);
        System.out.println("Age: " + age);
    }

    void checkAge() {
        if (age >= 18) {
            System.out.println("Age Category: Adult");
        } else {
            System.out.println("Age Category: Minor");
        }
    }
}

class Doctor extends Person {

    String specialization;
    double consultationFee;

    Doctor(int id, String name, int age,
           String specialization, double consultationFee) {
        super(id, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    double calculateConsultationAmount() {
        return consultationFee;
    }

    void displayDoctorDetails() {
        displayPersonDetails();
        System.out.println("Specialization: " + specialization);
        System.out.printf("Consultation Fee: %.2f%n", consultationFee);
        System.out.printf("Consultation Amount: %.2f%n",
                          calculateConsultationAmount());
    }
}

class Patient extends Person {

    String disease;
    int roomNumber;
    int days;

    Patient(int id, String name, int age,
            String disease, int roomNumber, int days) {
        super(id, name, age);
        this.disease = disease;
        this.roomNumber = roomNumber;
        this.days = days;
    }

    double calculateRoomCharge() {
        return days * 1000.0;
    }

    void displayPatientDetails() {
        displayPersonDetails();
        System.out.println("Disease: " + disease);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Days Admitted: " + days);
        System.out.printf("Room Charge: %.2f%n", calculateRoomCharge());
    }
}

public class Ex05_Hospital_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Doctor Details ---");

        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctorName = sc.nextLine();

        System.out.print("Enter Doctor Age: ");
        int doctorAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        double fee = sc.nextDouble();

        Doctor doctor = new Doctor(
            doctorId, doctorName, doctorAge, specialization, fee
        );

        System.out.println("\nDoctor Details:");
        doctor.displayDoctorDetails();
        doctor.checkAge();

        sc.nextLine();

        System.out.println("\n--- Patient Details ---");

        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int patientAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Room Number: ");
        int roomNumber = sc.nextInt();

        System.out.print("Enter Number of Days Admitted: ");
        int days = sc.nextInt();

        Patient patient = new Patient(
            patientId, patientName, patientAge,
            disease, roomNumber, days
        );

        System.out.println("\nPatient Details:");
        patient.displayPatientDetails();
        patient.checkAge();

        sc.close();
    }
}