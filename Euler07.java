import java.util.*;
public class Euler07 {
    static int req(int n) {
        int limit = 105000;
        boolean[] isPrime = new boolean[limit];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                count++;
                if (count == n) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Sample test cases
        int[] testCases = {3, 6, 100};  // Replace with any desired test cases
        for (int n : testCases) {
            System.out.println("The " + n + "th prime number is: " + req(n));
        }
    }
}
