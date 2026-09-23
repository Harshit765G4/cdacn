import java.util.Scanner;

public class Ex07_TemperatureConversion {

    static double convertTemperature(double celsius) {

        double fahrenheit = (celsius * 9 / 5) + 32;

        return fahrenheit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = convertTemperature(celsius);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        if (fahrenheit > 100) {
            System.out.println("Temperature is above 100°F.");
        } else {
            System.out.println("Temperature is 100°F or below.");
        }

        sc.close();
    }
}