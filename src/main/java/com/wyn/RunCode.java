package com.wyn;

import com.wyn.enums.SortMethod;
import com.wyn.model.TreeNode;
import com.wyn.top100.BuildTree;
import com.wyn.utils.Print;
import com.wyn.utils.sort.SortStrategy;

import java.util.Collections;

public class RunCode {
    public static void main(String[] args) {
//        int[] nums = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
//        SortStrategy.getMethodMap().get(SortMethod.QUICK).accept(nums);
//        Print.printList(Collections.singletonList(nums));
//        System.out.println();
        int[] pre = new int[]{1,2,4,5,3,6,7};
        int[] in = new int[]{4,2,5,1,6,3,7};
        BuildTree buildTree = new BuildTree();
        TreeNode treeNode = buildTree.buildTree(pre, in);
        System.out.println();
    }
}
