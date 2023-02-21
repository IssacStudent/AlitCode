package com.wyn.top100;

import com.wyn.utils.Print;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集，使用回溯法
 * @author Yining Wang
 * @date 2023年2月21日11:13:01
 * @since <pre>2023/02/21</pre>
 */
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
