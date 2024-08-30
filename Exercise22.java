
// Print a pattern like a pyramid
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Input number of rows : ");
        int n = in.nextInt();

        // a pyramid
        int s = n + 4 - 1;
        System.out.println("s : " + s);

        for (int i = 1; i <= n; i++) {
            for (int j = s; j != 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }

    }
}
