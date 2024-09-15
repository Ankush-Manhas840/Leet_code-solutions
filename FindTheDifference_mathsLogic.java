public class FindTheDifference_mathsLogic {
    public char findTheDifference(String s, String t) {
        int count_s=0;
        int count_t=0;
        for(int i=0;i<s.length();i++){
            count_s+=(int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            count_t+=(int)t.charAt(i);
        }
        int diff=count_t-count_s;
        return (char)diff;
    }
}
