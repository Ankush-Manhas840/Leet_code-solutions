public class max_subarrayBRUTEFORCE {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int largest=Integer.MIN_VALUE;
        for(int start=0;start<nums.length;start++){
            int sum=0;
            for(int end=start;end<nums.length;end++){

                sum+=nums[end];
                if(sum>largest){
                    largest=sum;

                }


            }
        }
        return largest;

    }

    public static void main(String[] args) {

    }
}
