public class StudentResult {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Usage: java StudentResult <Name> <Mark1> <Mark2> <Mark3>");
            return;
        }

        String studentName = args[0];

        int mark1 = Integer.parseInt(args[1]);
        int mark2 = Integer.parseInt(args[2]);
        int mark3 = Integer.parseInt(args[3]);

        int total = mark1 + mark2 + mark3;

        double average = (double) total / 3;

        String result;

        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println("Student Name: " + studentName);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Result: " + result);
    }
}