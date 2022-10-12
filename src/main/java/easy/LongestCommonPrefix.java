package easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings) {
        if (strings[0].length() == 0) {
            return "";
        }

        return strings[0].substring(0, findLongestPrefixIndex(strings));
    }

    private int findLongestPrefixIndex(String[] strings) {
        char[] word = strings[0].toCharArray();
        int index = 0;

        for (int i = 0; i < word.length; i++) {
            char curChar = word[i];
            index = i;

            for (String string : strings) {
                if (i > string.length() - 1 || curChar != string.charAt(i)) return index;
            }

        }

        return index + 1;
    }
}
