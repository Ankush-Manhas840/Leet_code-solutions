import java.util.HashMap;
public class substring_check {




        public static String twoStrings(String s1, String s2) {
            // Write your code here
            HashMap<Character, Boolean> ab = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                ab.put(s1.charAt(i), true);
            }
            for (int j = 0; j < s2.length(); j++) {
                if (ab.containsKey(s2.charAt(j))) return "YES";
            }
            return "NO";
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(twoStrings("hello", "world")); // Expected output: YES
            System.out.println(twoStrings("abc", "def"));     // Expected output: NO
            System.out.println(twoStrings("abc", "cba"));     // Expected output: YES
        }


}
