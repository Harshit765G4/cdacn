import java.util.Scanner;

public class Ex04_LargestOfTwo {

    static int findLargest(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int largest = findLargest(num1, num2);

        System.out.println("Largest number: " + largest);

        sc.close();
    }
}