package easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        var romanNumbers = new int[128];
        romanNumbers['I'] = 1;
        romanNumbers['V'] = 5;
        romanNumbers['X'] = 10;
        romanNumbers['L'] = 50;
        romanNumbers['C'] = 100;
        romanNumbers['D'] = 500;
        romanNumbers['M'] = 1000;

        var array = s.toCharArray();
        int sum = 0;
        //Arguments.of("DCXXI", 621)601

        for (int i = array.length - 1; i >= 0; i--) {
            if (i - 1 >= 0 && array[i] != 'I'
                    && (array[i - 1] == 'I' || array[i - 1] == 'X' || array[i - 1] == 'C')) {
                var nextValue = romanNumbers[array[i - 1]];
                var currentNumber = romanNumbers[array[i]];

                if (array[i - 1] == 'I' && (array[i] == 'X' || array[i] == 'V')) {
                    sum += currentNumber - nextValue;
                    i--;
                    continue;
                }

                if (array[i - 1] == 'X' && (array[i] == 'L' || array[i] == 'C')) {
                    sum += currentNumber - nextValue;
                    i--;
                    continue;
                }

                if (array[i - 1] == 'C' && (array[i] == 'D' || array[i] == 'M')) {
                    sum += currentNumber - nextValue;
                    i--;
                    continue;
                }
            }

            var currentNumber = romanNumbers[array[i]];
            sum += currentNumber;
        }

        return sum;
    }
}
