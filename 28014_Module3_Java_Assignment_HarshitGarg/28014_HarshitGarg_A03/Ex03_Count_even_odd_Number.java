public class Ex03_Count_even_odd_Number {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35};
        int evenCount = 0;
        int oddCount = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
