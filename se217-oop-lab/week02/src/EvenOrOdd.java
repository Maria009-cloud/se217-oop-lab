public class EvenOrOdd {

    public static void main(String[] args) {
        int number = 70;

        if (isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}