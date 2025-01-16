public class Max_subarrayOPTIMIZED {
   static public int maxSubArray(int[] nums) {
        int curr_sum = 0, Max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curr_sum += nums[i];
            Max_sum = Math.max(curr_sum, Max_sum);
            if (curr_sum < 0) curr_sum = 0; // Reset curr_sum if it's negative
        }
        return Max_sum;
    }

    public static void main(String[] args) {



            // Test case 1
            int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println("Max Subarray Sum (Test Case 1): " + maxSubArray(nums1)); // Output: 6

            // Test case 2
            int[] nums2 = {1};
            System.out.println("Max Subarray Sum (Test Case 2): " + maxSubArray(nums2)); // Output: 1

            // Test case 3
            int[] nums3 = {5, 4, -1, 7, 8};
            System.out.println("Max Subarray Sum (Test Case 3): " + maxSubArray(nums3)); // Output: 23

            // Test case 4
            int[] nums4 = {-1, -2, -3, -4};
            System.out.println("Max Subarray Sum (Test Case 4): " + maxSubArray(nums4)); // Output: -1

            // Test case 5
            int[] nums5 = {-2, 1};
            System.out.println("Max Subarray Sum (Test Case 5): " + maxSubArray(nums5)); // Output: 1

    }
}
