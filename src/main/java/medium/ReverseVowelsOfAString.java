package medium;

//https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;

        char[] ch = s.toCharArray();

        while (l < r) {

            while (l < r && !isVowel(ch[l])) l++;

            while (r > l && !isVowel(ch[r])) r--;

            {
                char tmp = ch[l];
                ch[l] = ch[r];
                ch[r] = tmp;
            }

            l += 1;
            r -= 1;
        }
        return new String(ch);
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e'
                || c == 'i' || c == 'o' || c == 'u';
    }
}
