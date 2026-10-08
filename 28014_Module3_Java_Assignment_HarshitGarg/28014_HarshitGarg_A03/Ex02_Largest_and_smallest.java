import java.util.Scanner;

public class Ex02_Largest_and_Smallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < n; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}