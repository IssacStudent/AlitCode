package com.wyn.top100;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Integer result = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for (int n : nums) {
            int i = 0;
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
