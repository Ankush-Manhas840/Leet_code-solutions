public class Reverse_string {
    //solution starts
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        char space;
        while(left<right){
            space=s[left];
            s[left]=s[right];
            s[right]=space;
            left++;
            right--;

        }

    }
    //solution ends
}
