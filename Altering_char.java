public class Altering_char {
    //it is a basic approach for this question
    public static int alternatingCharacters(String s) {
        // Write your code here
        int del=0;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1) break;
            else if(s.charAt(i)==s.charAt(i+1)) del++;

        }
        return del;

    }
}
