package com.wyn.top100;

import com.wyn.model.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个整数数组 preorder 和 inorder
 * 其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历
 * 请构造二叉树并返回其根节点。
 * @author Yining Wang
 * @date 2023年2月22日14:00:40
 * @since <pre>2023/02/22</pre>
 */
public class BuildTree {

    /**
     * 快速找到根节点的中序遍历的位置索引
     */
    Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, preorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        int root = preorder[preStart];
        int rootIndex = indexMap.get(root);
        TreeNode node = new TreeNode(root);
        int leftNum = rootIndex - inStart;
        //核心代码
        node.left = build(preorder, inorder, preStart + 1, preStart + leftNum, inStart, rootIndex - 1);
        node.right = build(preorder, inorder, preStart + leftNum + 1, preEnd, rootIndex + 1, inEnd);
        return node;
    }

    /**
     * 简洁版
     */
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        //终止条件
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                int[] preLeft = Arrays.copyOfRange(preorder, 1, i + 1);
                int[] preRight = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                int[] inLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inRight = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                root.left = buildTree2(preLeft, inLeft);
                root.right = buildTree2(preRight, inRight);
                break;
            }
        }
        return root;
    }
}
