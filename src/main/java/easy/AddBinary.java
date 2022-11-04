package easy;

public class AddBinary {

    public static void main(String[] args) {
        //https://www.softwaretestinghelp.com/convert-char-to-int-in-java/
        int a = "1".charAt(0) - '0';
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i>=0 || j>=0) {
            int sum = carry;
            if (i>=0) sum+=a.charAt(i)-'0';
            if (j>=0) sum+=b.charAt(j)-'0';
            sb.append(sum%2);
            carry = sum/2;

            i--;
            j--;
        }

        if (carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}
