import java.util.Scanner;

public class Ex02_StudentGrade {

    static char calculateGrade(int marks) {

        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade = calculateGrade(marks);

        System.out.println("Grade: " + grade);

        sc.close();
    }
}