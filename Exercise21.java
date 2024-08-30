
/* Output
1
12
123
1234
12345
123456
1234567
12345678
123456789
 */
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of rows!
        System.out.print("Input number of rows : ");
        int n = input.nextInt();

        // Calculate
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
