import java.io.*;
import java.util.*;

public class MakingAnagrams {

    public static int makingAnagrams(String s1, String s2) {
        HashMap<Character, Integer> s_1 = new HashMap<>();
        HashMap<Character, Integer> s_2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s_1.put(s1.charAt(i), s_1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            s_2.put(s2.charAt(i), s_2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (s_1.equals(s_2)) return 0;

        int deletion = 0;

        for (char a : s_1.keySet()) {
            if (s_2.containsKey(a)) {
                int common = Math.min(s_1.get(a), s_2.get(a));
                s_1.put(a, s_1.get(a) - common);
                s_2.put(a, s_2.get(a) - common);
                deletion += common;
            }
        }

        int req_ans = (s1.length() + s2.length()) - (2 * deletion);
        return req_ans;
    }

    public static void main(String[] args) {
        String s1 = "cde";
        String s2 = "abc";
        int result1 = makingAnagrams(s1, s2);
        System.out.println("Test Case 1: " + result1);

        String s3 = "hello";
        String s4 = "billion";
        int result2 = makingAnagrams(s3, s4);
        System.out.println("Test Case 2: " + result2);
    }
}
