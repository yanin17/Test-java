
// Find the greatest of three numbers
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ton the keyborad
        System.out.print("Input the 1st number : ");
        int num1 = input.nextInt();

        System.out.print("Input the 2nd number : ");
        int num2 = input.nextInt();

        System.out.print("Input the 3rd number : ");
        int num3 = input.nextInt();

        // Calculate - Compare
        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest : " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest : " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest : " + num3);

    }

}
