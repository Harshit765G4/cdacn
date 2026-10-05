public class Ex04_Search_Element {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int index = 0;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is found in the array at index " + index);
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }
}
