public class CountVowels {

    public static void main(String[] args) {
        String input = "Programming";
        System.out.println("Vowel count in \"" + input + "\": " + countVowels(input));
    }

    public static int countVowels(String text) {
        int count = 0;
        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}