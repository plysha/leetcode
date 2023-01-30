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

    public boolean isPalindrome2Solution(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }

}
