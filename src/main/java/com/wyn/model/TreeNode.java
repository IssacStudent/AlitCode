package com.wyn.model;

/**
 * 二叉树节点定义
 * @author Yining Wang
 * @date 2023年2月20日14:12:33
 * @since <pre>2023/02/20</pre>
 */
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
