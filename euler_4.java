import java.io.*;

public class euler_4 {

    public static void main(String[] args) throws IOException {
        // Define the number of test cases and the test cases themselves
        int t = 3;
        int[] testCases = {101110, 800000, 600000};

        // Loop through the test cases
        for (int i = 0; i < t; i++) {
            int n = testCases[i];
            int max = 0;
            for (int x = 999; x >= 100; x--) {
                for (int y = 100; y <= 999; y++) {
                    int pal = x * y;
                    String a = String.valueOf(pal);
                    StringBuilder ac = new StringBuilder(a);

                    if (a.equals(ac.reverse().toString()) && pal < n) {
                        if (pal > max) max = pal;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
