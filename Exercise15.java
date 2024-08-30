
// Adds all the digits
// 565 -> 5+6+5 = 16
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input on the keyboard
        System.out.print("Input an integer between 0 and 9999 : ");
        int num = sc.nextInt();

        // To Split the digits
        int firstDigit = num % 10;
        int remainingNumber = num / 10;

        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;

        int fourthDigit = remainingNumber % 10;

        // Calculate
        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

        // Display the result
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }

}
