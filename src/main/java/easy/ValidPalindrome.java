package easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String raw = s.toLowerCase().replaceAll("[^a-zA-Z\\d]", "");
        if (raw.isEmpty()) return true;
        int l = 0;
        int r = raw.length() - 1;

        while (l <= r) {
            if (raw.charAt(l) == raw.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;

    }
}
