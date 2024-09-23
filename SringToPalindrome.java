public class SringToPalindrome {
    //A simple HAckerRank problem
    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int left=0;
        int right=s.length()-1;
        int changes=0;
        while(left<right){
            int x=(int)s.charAt(left);
            int y=(int)s.charAt(right);
            changes+=Math.abs(x-y);
            left++;
            right--;
        }
        return changes;

    }
    public static void main(String[] args) {
        String s = "abc";  // Example input
        int result = theLoveLetterMystery(s);
        System.out.println("Minimum operations required: " + result);
    }
}
