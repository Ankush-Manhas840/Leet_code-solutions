public class small_greater_than_target {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
        }
        return letters[start%letters.length];

    }
}
//my logic was partially correct but i was not able to handle all the test cases so looked int ot the solutions i learned
//how it is done
