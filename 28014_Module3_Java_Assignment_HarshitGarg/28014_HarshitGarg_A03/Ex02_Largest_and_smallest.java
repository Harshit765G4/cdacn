public class Ex02_Largest_and_smallest {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 75, 40, 60};
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int n : numbers) {
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
