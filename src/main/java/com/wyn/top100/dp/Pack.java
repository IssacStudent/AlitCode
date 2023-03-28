package com.wyn.top100.dp;

/**
 * 0-1背包问题
 * @author Yining Wang
 * @date 2023年3月28日16:43:24
 * @since <pre>2023/03/28</pre>
 */
public class Pack {
    public int pack(int n, int weight, int[] weights, int[] val) {
        int[][] dp = new int[n + 1][weight + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < weight; j++) {
                if (weight - weights[i - 1] < 0) {
                    //不装，因为装不下了，所以和前一个一样
                    dp[i][weight] = dp[i - 1][weight];
                } else {
                    //装，所以更新dp
                    dp[i][weight] = Math.max(dp[i - 1][weight], dp[i - 1][weight - weights[i - 1]] + val[i - 1]);
                }
            }
        }
        return dp[n][weight];
    }
}
