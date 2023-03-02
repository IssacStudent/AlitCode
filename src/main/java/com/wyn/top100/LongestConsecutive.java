package com.wyn.top100;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
public class LongestConsecutive {
	public int longestConsecutive(int[] nums) {
		Integer result = 0;
		Set<Integer> set = new HashSet<>();
		for (int n : nums) {
			set.add(n);
		}
		for (int n : nums) {
			int i = 0;
			//减少判断次数
			if (!set.contains(n - 1)) {
				while (set.contains(n + i)) {
					i++;
				}
			}
			result = Math.max(result, i);
		}
		return result;
	}

}
