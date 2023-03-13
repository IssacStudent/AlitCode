package com.wyn.top100.listnode;

import com.wyn.model.ListNode;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @author Yining Wang
 * @date 2023年3月13日16:37:35
 * @since <pre>2023/03/13</pre>
 */
public class ReverseList {
    private ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        reverse(head);
        return newHead;
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode next = head.next;
        if (next.next == null) {
            next.next = head;
            head.next = null;
            newHead = next;
        } else {
            reverse(next).next = current;
            current.next = null;
        }
        return current;
    }
}
