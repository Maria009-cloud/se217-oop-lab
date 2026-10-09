public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " = " + calculateFactorial(number));
    }


    public static int calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is undefined for negative numbers.");
            return -1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}