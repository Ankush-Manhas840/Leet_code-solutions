import java.util.*;
public class rearrangeThenPalindrome {
    public static String gameOfThrones(String s) {
        // Write your code here
        HashMap<Character,Integer> ab=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(ab.containsKey(s.charAt(i))==false){
                ab.putIfAbsent(s.charAt(i),1);
            }
            else{
                int val=ab.get(s.charAt(i));
                ab.put(s.charAt(i),val+1);
            }
        }

        int check=0;
        for(int val : ab.values()){
            if(val%2!=0) check++;
        }
        if(check>1){
            return "NO";
        }
        else{
            return "YES";
        }

    }
    public static void main(String[] args)  {
        String s1 = "aaabbbb";  // Example 1
        String result1 = gameOfThrones(s1);
        System.out.println("Input: " + s1);
        System.out.println("Result: " + result1);

        String s2 = "cdefghmnopqrstuvw";  // Example 2
        String result2 = gameOfThrones(s2);
        System.out.println("Input: " + s2);
        System.out.println("Result: " + result2);

        String s3 = "cdcdcdcdeeeef";  // Example 3
        String result3 = gameOfThrones(s3);
        System.out.println("Input: " + s3);
        System.out.println("Result: " + result3);
    }


}
