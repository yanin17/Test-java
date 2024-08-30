public class Exercise7 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };

        // Calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Calculate average value
        double average = sum / numbers.length;

        // Display the result of the average
        System.out.println("Average value of the array elements is : " + average);
    }

}
