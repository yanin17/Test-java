
// Print the number of years and days
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Calculate minutes in year = 60 minutes/ a hour * a day in a hour * days in a
        // year
        double minutesInYear = 60 * 24 * 365;

        // Input on the keyboard
        System.out.print("Input the number of minutes : ");
        double min = input.nextDouble();

        // Calculate
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        // Display the result
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }

}
