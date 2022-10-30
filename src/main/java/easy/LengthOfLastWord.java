package easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int k = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) != ' ') {
                k++;
            }

            if (k != 0 && s.charAt(j) == ' ') {
                return k;
            }
        }

        return k;
    }
}
