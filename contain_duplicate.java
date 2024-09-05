import java.util.*;
public class contain_duplicate {
    //solution starts here
    public boolean containsDuplicate(int[] nums) {
        boolean check=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            if( i+1<nums.length&& nums[i]==nums[i+1] ){
                check=true;
                break;
            }


        }

        return check;
    }
    //ends here
}
