import java.util.Scanner;

public class Ex05_TotalAndAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double subject3 = sc.nextDouble();

        double total = subject1 + subject2 + subject3;
        double average = total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}