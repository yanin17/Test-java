// Print a face
public class Exercise12 {
    public static void main(String[] args) {
        String[] arra = new String[5];

        arra[0] = " +\"\"\"\"\"+ ";
        arra[1] = "[| o o |]";
        arra[2] = " | ^ | ";
        arra[3] = " |'-'| ";
        arra[4] = "+_____+";

        for (int i = 0; i < 5; i++) {
            System.out.println(arra[i]);
        }
    }
}
