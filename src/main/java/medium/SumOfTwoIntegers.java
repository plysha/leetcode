package medium;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b!=0) {
            //carry
            int tmp = (a&b)<<1;
            //add
            a = a^b;
            b = tmp;
        }

        return a;
    }
}
