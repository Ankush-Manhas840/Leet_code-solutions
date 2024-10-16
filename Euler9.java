public class Euler9 {
    static int pyth(int n) {
        int max = -1;
        for (int a = 1; a < (n / 3); a++) {
            for (int b = a + 1; b < (n / 2); b++) {
                int c = n - a - b;
                if (a * a + b * b == c * c) {
                    int product = a * b * c;
                    if (max < product) max = product;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(pyth(12));  // Expected output: 60
        System.out.println(pyth(30));  // Expected output: 780
        System.out.println(pyth(1000)); // Expected output: 31875000
    }
}
//it is a bit complicated but all you have to do is set ranges accordingly it is an easy question then