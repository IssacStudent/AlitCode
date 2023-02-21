package com.wyn.top100;

/**
 * 盛最多水的容器
 * 思路：双指针，不断更新最大区域
 * @author Yining Wang
 * @date 2023年2月21日11:16:40
 * @since <pre>2023/02/21</pre>
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;
        while(l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(maxArea, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
