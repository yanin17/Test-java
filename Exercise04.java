public class Exercise4 {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        // The String to check the above two Strings to see
        // if they end with this valie (se).
        String end_str = "se";

        // Check first two Strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        // Display the result of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " + "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"? " + ends2);

        // endsWith method - check avaible of ending that String ?

    }
}
