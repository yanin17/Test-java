
// Fahrenheit to Celsius degree
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input on the keyboard
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Calculate Fahrenheit to Celsius
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);

        // Display the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");
    }
}
