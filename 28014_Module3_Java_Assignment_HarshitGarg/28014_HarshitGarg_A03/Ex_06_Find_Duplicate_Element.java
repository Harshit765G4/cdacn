public class Ex_06_Find_Duplicate_Element {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10};
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate element found: " + numbers[i]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }
    }
}
