
// Inches to meters
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input on the keyboard
        System.out.print("Input a value for inche : ");
        double inch = input.nextDouble();

        // Calculate Inches to meters
        double meters = inch * 0.0254;

        // Display the result
        System.out.println(inch + " inch is " + meters + " meters");
    }

}
