package com.wyn.top100;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int n : nums) {
			if (set.contains(n)) {
				set.remove(n);
			} else {
				set.add(n);
			}
		}
		return Integer.parseInt(set.toArray()[0].toString());
	}

	/**
	 * 使用异或运算
	 * @param nums
	 * @return
	 */
	public int singleNumber2(int[] nums) {
		int single = 0;
		for (int num : nums) {
			single ^= num;
		}
		return single;
	}
}
