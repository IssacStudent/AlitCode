package com.wyn.top100;

/**
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * @author Yining Wang
 * @date 2023年3月21日14:59:00
 * @since <pre>2023/03/21</pre>
 */
public class FindKthLargest {
    /**
     * 思路：堆排序，然后不断取出堆顶
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        buildMaxHeap(nums, n);
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);
            --n;
            maxHeapify(nums, 0, n);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] nums, int n) {
        for (int i = (n / 2); i >= 0; --i) {
            maxHeapify(nums, i, n);
        }
    }

    public void maxHeapify(int[] a, int i, int n) {
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        if (l < n && a[l] > a[largest]) {
            largest = l;
        }
        if (r < n && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a, largest, n);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
