package com.wyn.top100;

import com.wyn.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 * @author Yining Wang
 * @date 2023年2月23日09:06:46
 * @since <pre>2023/02/23</pre>
 */
public class Flatten {
    List<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        preorder(root);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i).left = null;
        }
    }
    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}
