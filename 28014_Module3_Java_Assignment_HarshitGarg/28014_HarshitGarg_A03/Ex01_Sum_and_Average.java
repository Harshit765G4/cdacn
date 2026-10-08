import java.util.Scanner;

public class Ex01_Sum_and_Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}