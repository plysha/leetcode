package medium;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        //init a dp first value
        //dp[i] - сколько минимально нужно монет для кол-ва i (amount)
        dp[0] = 0;

        for (int a = 1; a <= amount; a++) {
            for (int c : coins) {
                if (a - c >= 0) {
                    // find a minimum count value to get amount of a
                    dp[a] = Math.min(dp[a], 1 + dp[a - c]);
                }
            }
        }

        if (dp[amount] != amount + 1) {
            return dp[amount];
        } else {
            return -1;
        }
    }

}
