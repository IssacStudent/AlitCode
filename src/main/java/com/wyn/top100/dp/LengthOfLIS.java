package com.wyn.top100.dp;

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 *
 * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 * @author Yining Wang
 * @date 2023年3月22日14:45:04
 * @since <pre>2023/03/22</pre>
 */
@SuppressWarnings("all")
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            int tmpMax = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    tmpMax = Math.max(tmpMax, dp[j]);
                }
            }
            dp[i] = tmpMax + 1;
            result = Math.max(result, dp[i]);
        }
        //输出序列（最小字典序）
        //从后往前扫描，一定是字典序最小的
        int j = result;
        int[] resultSeq = new int[result];
        for (int i = dp.length - 1; i >= 0; i--) {
            if (dp[i] == j) {
                resultSeq[--j] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,6};
        LengthOfLIS lengthOfLIS = new LengthOfLIS();
        System.out.println(lengthOfLIS.lengthOfLIS(nums));
    }
}
