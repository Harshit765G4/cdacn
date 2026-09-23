import java.util.Scanner;

public class Ex07_PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is Positive");
        } else if (number < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}