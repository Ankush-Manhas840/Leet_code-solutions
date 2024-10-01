import java.util.*;
public class AnagramInaString {
    //AnagramInaString.java
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> arb=new ArrayList<>();

        if(p.length()>s.length()) return arb;
        HashMap<Character,Integer> ab=new HashMap<>();
        for(int i=0;i<p.length();i++){
            ab.put(p.charAt(i),ab.getOrDefault(p.charAt(i),0)+1);
        }
        for(int j=0;j<=s.length()-p.length();j++){
            HashMap<Character,Integer> cb=new HashMap<>();
            for(int k=j;k<j+p.length();k++){
                char a=s.charAt(k);
                cb.put(a,cb.getOrDefault(a,0)+1);

            }
            if(ab.equals(cb)){
                arb.add(j);
            }
        }
        return arb;

    }

    public static void main(String[] args) {
        AnagramInaString solution = new AnagramInaString();

        // Test case 1
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println("Anagrams of '" + p1 + "' in '" + s1 + "': " + solution.findAnagrams(s1, p1));

        // Test case 2
        String s2 = "abab";
        String p2 = "ab";
        System.out.println("Anagrams of '" + p2 + "' in '" + s2 + "': " + solution.findAnagrams(s2, p2));

        // Add more test cases if needed
    }

}
