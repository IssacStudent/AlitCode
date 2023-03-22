package com.wyn.top100;

/**
 * 买卖股票的最佳时间I、II
 * @author Yining Wang
 * @date 2023年3月22日15:36:53
 * @since <pre>2023/03/22</pre>
 */
public class MaxProfit {
    public int maxProfit1(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            result = Math.max(result, prices[i] - min);
        }
        return result;
    }

    /**
     * 思路：一段一段的计算利润，并且只计算递增的，如果递减就直接跳过
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int result = 0;
        for (int i = 1, mark = 0;i< prices.length; i++, mark++){
            if (prices[i] >= prices[mark]) {
                result += (prices[i] - prices[mark]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit2(nums));
    }
}
