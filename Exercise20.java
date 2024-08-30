
// Display the multiplication table of a given integer
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input on the keybord
        System.out.print("Input number of terms : ");
        int n = in.nextInt();

        System.out.println("\n");
        for (int i = 0; i <= 12; i++)
            System.out.println(n + " X " + i + " = " + n * i);

    }

}
