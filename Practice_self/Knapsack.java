package Practice_self;
import java.util.*;
public class Knapsack {

    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int max_weight = 30;

        // 2D array with 3 rows
        int[][] total_arr = new int[3][];
        total_arr[0] = wt;
        total_arr[1] = val;
        total_arr[2] = new int[wt.length]; // extra row for computed values
        int weight=0;

        // Fill the 3rd row with val/wt (value-to-weight ratio)
        for (int j = 0; j < wt.length; j++) {
            total_arr[2][j] = (total_arr[1][j] / total_arr[0][j]);
        }
        int items=0;
        int[] krr = total_arr[2].clone(); // Create a copy of the third row
        Arrays.sort(krr); // Sort the copy

        while (weight < max_weight) {
            items += krr[weight % krr.length]; // Use modulo to cycle through the array
            weight++;

            // Print the current state for debugging
            System.out.println("Added: " + krr[weight % krr.length] + ", Total Items: " + items + ", Current Weight: " + weight);
        }

        
        //displayArray(total_arr);
        System.out.println(items);
    }



}
