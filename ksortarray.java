public class ksortarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(solution.search(nums1, target1)); // Expected output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(solution.search(nums2, target2)); // Expected output: -1

        int[] nums3 = {1};
        int target3 = 1;
        System.out.println(solution.search(nums3, target3)); // Expected output: 0

        int[] nums4 = {5, 6, 7, 8, 9, 1, 2, 3};
        int target4 = 3;
        System.out.println(solution.search(nums4, target4)); // Expected output: 7

        int[] nums5 = {6, 7, 1, 2, 3, 4, 5};
        int target5 = 6;
        System.out.println(solution.search(nums5, target5)); // Expected output: 0
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            // which side to go
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
