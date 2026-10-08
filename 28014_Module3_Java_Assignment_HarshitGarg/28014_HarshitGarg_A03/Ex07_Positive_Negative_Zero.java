import java.util.Scanner;

public class Ex07_Positive_Negative_Zero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Positive numbers: ");

        for (int num : numbers) {

            if (num > 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        System.out.print("Negative numbers: ");

        for (int num : numbers) {

            if (num < 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        int zeroCount = 0;

        for (int num : numbers) {

            if (num == 0) {
                zeroCount++;
            }
        }

        System.out.println("Zero values: " + zeroCount);

        sc.close();
    }
}