import java.util.Scanner;

public class Ex03_Count_Even_Odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int n1 : numbers) {

            if (n1 % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers = " + evenCount);
        System.out.println("Odd numbers = " + oddCount);

        sc.close();
    }
}