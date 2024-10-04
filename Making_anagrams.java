import java.util.HashMap;

public class Making_anagrams {

    public static int anagram(String s) {
        int len = s.length();
        if (len % 2 != 0) return -1;
        String a1 = s.substring(0, (len / 2));
        String b1 = s.substring((len / 2), len);
        int count = 0;
        HashMap<Character, Integer> ab = new HashMap<>();
        HashMap<Character, Integer> b_1 = new HashMap<>();
        for (int i = 0; i < a1.length(); i++) {
            ab.put(a1.charAt(i), ab.getOrDefault(a1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < b1.length(); i++) {
            b_1.put(b1.charAt(i), b_1.getOrDefault(b1.charAt(i), 0) + 1);
        }
        for (char a : ab.keySet()) {
            int c1 = ab.get(a);
            int c2 = b_1.getOrDefault(a, 0);
            if (c1 > c2) {
                count += c1 - c2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(anagram("aaabbb")); // Expected Output: 3
        System.out.println(anagram("ab"));     // Expected Output: 1
        System.out.println(anagram("abc"));    // Expected Output: -1
    }
}
