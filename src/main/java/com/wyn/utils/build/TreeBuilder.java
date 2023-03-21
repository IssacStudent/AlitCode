package com.wyn.utils.build;

import com.wyn.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 通过层序遍历构建二叉树
 * @author Yining Wang
 * @date 2023年3月21日19:24:20
 * @since <pre>2023/03/21</pre>
 */
public class TreeBuilder {

    public static TreeNode buildTreeByLevelOrder(int[] data) {
        if (data == null) {
            throw new NullPointerException("null");
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(data[0]);
        queue.offer(root);
        int n = data.length;
        int i = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            i++;
            if (i < n) {
                int leftVal = data[i];
                if (leftVal == -1) {
                    node.left = null;
                } else {
                    TreeNode left = new TreeNode(leftVal);
                    node.left = left;
                    queue.offer(left);
                }
            }
            i++;
            if (i < n) {
                int rightVal = data[i];
                if (rightVal == -1) {
                    node.right = null;
                } else {
                    TreeNode right = new TreeNode(rightVal);
                    node.right = right;
                    queue.offer(right);
                }
            }
        }
        return root;
    }

}
