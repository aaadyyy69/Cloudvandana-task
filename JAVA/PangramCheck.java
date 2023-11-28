import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    

    scanner.close();

}

    private static boolean checkPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }

        return charSet.size() == 26;
    }
}
