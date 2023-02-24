package com.wyn.top100;

import java.util.HashMap;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int l = 0, r = prices.length - 1;
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            result = Math.max(result, prices[i] - min);
        }
        return result;
    }
}
