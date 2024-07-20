import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static Map<Character, Integer> countChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        return charCount;
    }

    public static void main(String[] args) {
        String string = "avinash";
        Map<Character, Integer> result = countChar(string);
        System.out.println(result);
    }
}