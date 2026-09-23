import java.util.Scanner;

public class Ex05_VotingEligibility {

    static boolean isEligible(int age) {

        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        boolean eligible = isEligible(age);

        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}