public class TwoDArray {

    public static void main(String[] args) {
        int[][] matrix = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19}
        };


        System.out.println("Element at [0][0]: " + matrix[0][0]);
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        System.out.println("\nFull Matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}