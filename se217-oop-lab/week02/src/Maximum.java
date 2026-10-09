public class Maximum {

    public static void main(String[] args) {
        int num1 = 44;
        int num2 = 30;
        int result = findMaximum(num1, num2);

        System.out.println("Maximum value: " + result);
    }


    public static int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}