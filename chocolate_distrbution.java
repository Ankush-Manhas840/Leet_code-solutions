import java.util.ArrayList;
import java.util.Collections;

public class chocolate_distrbution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (i + m - 1 < arr.size()) {
                int diff = arr.get(i + m - 1) - arr.get(i);
                min = Math.min(min, diff);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        chocolate_distrbution solution = new chocolate_distrbution();

        ArrayList<Integer> test1 = new ArrayList<>();
        Collections.addAll(test1, 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42);
        System.out.println(solution.findMinDiff(test1, 7)); // Output: 23

        ArrayList<Integer> test2 = new ArrayList<>();
        Collections.addAll(test2, 3, 4, 1, 9, 56, 7, 9, 12);
        System.out.println(solution.findMinDiff(test2, 5)); // Output: 6

        ArrayList<Integer> test3 = new ArrayList<>();
        Collections.addAll(test3, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println(solution.findMinDiff(test3, 4)); // Output: 30
    }
}
