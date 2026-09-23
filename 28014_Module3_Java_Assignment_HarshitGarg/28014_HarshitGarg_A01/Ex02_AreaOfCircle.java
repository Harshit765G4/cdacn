import java.util.Scanner;

public class Ex02_AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);

        sc.close();
    }
}