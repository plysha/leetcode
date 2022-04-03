package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int tmp = x;
        int sum = 0;
        int r;

        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;
        }

        return tmp == sum;
    }
}
