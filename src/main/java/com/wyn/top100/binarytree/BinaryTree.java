package com.wyn.top100.binarytree;

import com.wyn.model.TreeNode;

public class BinaryTree {

    /**
     * 求二叉树深度
     */
    public int depth(TreeNode root) {
        return dfs(root);
    }

    /**
     * 求二叉树直径
     */
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }

}
