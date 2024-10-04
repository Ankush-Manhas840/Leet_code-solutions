import java.io.*;
import java.util.stream.*;

public class euler_1 {
    //for Passing all the test cases use big integer or long long respective ogf the language used
    static int sum1(int mul, int n) {
        if (n <= 1) return 0;
        n--;
        int rem = n % mul;
        int an = n - rem;
        int num_of_Terms = (an) / mul;
        int in_sum = mul + an;
        int sum = (num_of_Terms * in_sum) / 2;
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Test cases
        int n1 = 10;
        int n2 = 100;
        int n3 = 1000;

        System.out.println(sum1(3, n1) + sum1(5, n1) - sum1(15, n1)); // Output for n1
        System.out.println(sum1(3, n2) + sum1(5, n2) - sum1(15, n2)); // Output for n2
        System.out.println(sum1(3, n3) + sum1(5, n3) - sum1(15, n3)); // Output for n3

        bufferedReader.close();
    }
}
