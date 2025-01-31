public class Max_sum_subarray {
    public int maximumSumSubarray(int[] arr, int k) {
        int sum = 0;
        for (int l = 0; l < k; l++) {
            sum += arr[l];
        }
        int max = sum;
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum + arr[i + k - 1] - arr[i - 1];
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        Max_sum_subarray obj = new Max_sum_subarray();
        int[] arr1 = {2, 3, 5, 2, 9, 7, 1};
        int k1 = 3;
        System.out.println(obj.maximumSumSubarray(arr1, k1));

        int[] arr2 = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k2 = 4;
        System.out.println(obj.maximumSumSubarray(arr2, k2));

        int[] arr3 = {100, 200, 300, 400};
        int k3 = 2;
        System.out.println(obj.maximumSumSubarray(arr3, k3));
    }
}
