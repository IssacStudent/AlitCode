package com.wyn.top100.binarytree;

import com.wyn.model.TreeNode;

import java.util.*;

/**
 * 二叉树的层序遍历
 * @author Yining Wang
 * @date 2023年2月20日14:10:45
 * @since <pre>2023/02/20</pre>
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.addLast(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (queue.size() != 0) {
            int n = queue.size();
            //题目要求返回二维数组，因此需要知道每一层有多少个，所以一次处理一整层
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.pollFirst();
                list.add(node.val);
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            result.add(list);
            list = new ArrayList<>();
        }
        return result;
    }
}
