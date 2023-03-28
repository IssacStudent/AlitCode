package com.wyn.utils.search;

/**
 * 二分查找
 * @author Yining Wang
 * @date 2023年3月24日15:23:17
 * @since <pre>2023/03/24</pre>
 */
public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

}
