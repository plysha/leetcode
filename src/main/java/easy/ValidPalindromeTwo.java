package easy;

public class ValidPalindromeTwo {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return helper(s, l + 1, r) || helper(s, l, r - 1);
            }

            l++;
            r--;
        }

        return true;
    }

    public boolean helper(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }

        return true;
    }
}
