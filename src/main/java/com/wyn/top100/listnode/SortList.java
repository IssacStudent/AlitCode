package com.wyn.top100.listnode;

import com.wyn.model.ListNode;

/**
 * 给你链表的头结点head，请将其按升序排列并返回 排序后的链表。
 * @author Yining Wang
 * @date 2023年3月3日09:07:03
 * @since <pre>2023/03/03</pre>
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        return merge(left, right);
    }
    private ListNode findMid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode point = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                point.next = left;
                left = left.next;
            } else {
                point.next = right;
                right = right.next;
            }
            point = point.next;
        }
        point.next = (left == null ? right : left);
        return dummy.next;
    }
}
