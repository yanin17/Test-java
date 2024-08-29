import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        // Input from a User
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your message :");

        String str = myObj.nextLine();
        System.out.println("We got your String = " + str);

        // Get the character at position 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at the position 0 is" + " " + (char) index1);
        System.out.println("The character at the position 10 is" + " " + (char) index2);

        // charAt method ignore space!
    }
}
