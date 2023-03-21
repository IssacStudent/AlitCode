package com.wyn.top100.binarytree;

import com.wyn.model.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 * @author Yining Wang
 * @date 2023年3月21日19:08:27
 * @since <pre>2023/03/21</pre>
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    /**
     * 使用层序遍历
     * @param root
     * @return
     */
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            TreeNode right = node.right;
            TreeNode left = node.left;
            node.right = left;
            node.left = right;
            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }
        }
        return root;
    }
}
