import java.util.Scanner;

public class Ex06_Duplicate_Elements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            // Check whether this element appeared earlier
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check whether this element appears again
            for (int j = i + 1; j < n; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}