public class NestedLoop {

    public static void main(String[] args) {
        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}