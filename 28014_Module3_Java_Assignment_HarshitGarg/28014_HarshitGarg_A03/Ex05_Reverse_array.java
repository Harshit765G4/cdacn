public class Ex05_Reverse_array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Original array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("\nReversed array:");
        for (int n : reversed) {
            System.out.print(n + " ");
        }
    }
}
