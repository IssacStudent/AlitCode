package com.wyn.top100.binarytree;

import com.wyn.model.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @author Yining Wang
 * @date 2023年3月22日10:03:09
 * @since <pre>2023/03/22</pre>
 */
public class LowestCommonAncestor {
    Map<Integer, TreeNode> parents = new HashMap<>();
    Set<TreeNode> set = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        preOrder(root);
        TreeNode parent = p;
        while (parent != null) {
            set.add(parent);
            parent = parents.get(parent.val);
        }
        parent = q;
        while (parent != null) {
            if (set.contains(parent)) {
                return parent;
            }
            parent = parents.get(parent.val);
        }
        return null;
    }

    private void preOrder(TreeNode node) {
        if (node.left != null) {
            parents.put(node.left.val, node);
            preOrder(node.left);
        }
        if (node.right != null) {
            parents.put(node.right.val, node);
            preOrder(node.right);
        }
    }
}
