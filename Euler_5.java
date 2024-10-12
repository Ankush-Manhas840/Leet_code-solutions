public class Euler_5 {
    static int HCF(int x, int y) {
        if (y % x == 0) return x;
        int rem = y % x;
        int divi = x;
        return HCF(rem, divi);
    }

    static int Solu(int a, int b) {
        int num = a * b;
        int g_cd = HCF(a, b);
        return num / g_cd;
    }

    public static void main(String[] args) {
        // Example test case: Finding the LCM of numbers from 1 to 10
        int n = 10;
        int lcm = 1;
        for (int i = 2; i <= n; i++) {
            lcm = Solu(lcm, i);
        }
        System.out.println("LCM of numbers from 1 to " + n + " is: " + lcm);

        // Additional test cases
        int[] testCases = {5, 15, 20}; // Testing for different ranges
        for (int test : testCases) {
            lcm = 1;
            for (int i = 2; i <= test; i++) {
                lcm = Solu(lcm, i);
            }
            System.out.println("LCM of numbers from 1 to " + test + " is: " + lcm);
        }
    }
}
