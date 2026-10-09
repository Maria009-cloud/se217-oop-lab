public class StringMethods {

    public static void main(String[] args) {
        String text = "ankara messi";


        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Character at index 0: " + text.charAt(0));
        System.out.println("Substring (0 to 5): " + text.substring(0, 5));
    }
}