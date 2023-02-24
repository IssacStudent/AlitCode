package com.wyn.model;

/**
 * Definition for singly-linked list.
 * @author Yining Wang
 * @date 2023年2月23日11:17:16
 * @since <pre>2023/02/23</pre>
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
