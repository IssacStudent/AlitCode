package com.wyn.top100;

import com.wyn.utils.Print;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> t = new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }

    private void dfs(Integer index, int[] nums) {
        if (index == nums.length) {
            result.add(new ArrayList<>(t));
            Print.printList(result);
            return;
        }
        t.add(nums[index]);
        dfs(index + 1, nums);
        t.remove(t.size() - 1);
        dfs(index + 1, nums);
    }
}
