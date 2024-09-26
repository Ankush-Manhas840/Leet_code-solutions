public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int num = x;
        while (num > 0) {
            int i = num % 10;
            rev = rev * 10 + i;
            num = num / 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        Palindrome checker = new Palindrome(); // Changed from PalindromeChecker to Palindrome

        int[] numbers = {121, -121, 12321}; // Example numbers to check

        for (int number : numbers) {
            if (checker.isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }
}
