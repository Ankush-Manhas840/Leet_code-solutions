package Practice_self;

public class GCD {
    static int HCF(int x, int y) {
        if (x > y) return 0;
        if (y % x == 0) return x;
        int rem = y % x;
        int divi = x;
        return HCF(rem, divi);
    }

    public static void main(String[] args) {
        System.out.println(HCF(15, 24));  // Example case, should return 3
        System.out.println(HCF(12, 36));  // Test case, should return 12
        System.out.println(HCF(25,100)); // Test case, should return 25
        System.out.println(HCF(9, 28));   // Test case, should return 1 (no common factor other than 1)
        System.out.println(HCF(40, 80));  // Test case, should return 40
        System.out.println(HCF(17, 31));  // Test case, should return 1 (both are prime relative to each other)
    }
}
