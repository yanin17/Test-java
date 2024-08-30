
// Compute (BMI)
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input on the keyboard
        System.out.print("Input weight in pounds : ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches : ");
        double inches = input.nextDouble();

        // Calculate BMI
        double bmi = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);

        // Display the result
        System.out.println("Body Mass Index is " + bmi + "\n");

    }
}
