import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Roman Number: ");
            String roman = scanner.nextLine();

            int result = 0;

            for (int i = 0; i < roman.length(); i++) {
                int current = romanMap.get(roman.charAt(i));
                int next = (i + 1 < roman.length()) ? romanMap.get(roman.charAt(i + 1)) : 0;

                if (current >= next) {
                    result += current;
                } else {
                    result += (next - current);
                    i++;
                }
            }

            System.out.println("Integer representation: " + result);
        }
    }
}
