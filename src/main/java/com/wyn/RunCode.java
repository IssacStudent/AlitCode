package com.wyn;

import com.wyn.top100.Subsets;

import java.util.List;

public class RunCode {
    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        List<List<Integer>> subsets1 = subsets.subsets(new int[]{1, 2, 3});
        System.out.println();
    }
}
