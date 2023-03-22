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
            int max = -1;
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp[j]);
                    flag = true;
                }
            }
            if (flag) {
                dp[i] = max + 1;
            } else {
                //如果前面没有一个数字比它小，那必须置为1
                dp[i] = 1;
            }
            result = Math.max(dp[i], result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
        LengthOfLIS lengthOfLIS = new LengthOfLIS();
        lengthOfLIS.lengthOfLIS(nums);
    }
}
