public class leetcode_bin {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        if(nums.length==1){
            start=0;
            end=0;

        }
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;


    }
}
