package com.wyn.top100.listnode;

import com.wyn.model.ListNode;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return false;
        }
        while(fast.next != null) {
            slow = slow.next;
            if (fast.next.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
