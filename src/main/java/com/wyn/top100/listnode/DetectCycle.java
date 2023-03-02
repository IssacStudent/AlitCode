package com.wyn.top100.listnode;

import com.wyn.model.ListNode;

import java.util.HashMap;
import java.util.Map;

public class DetectCycle {
    Map<ListNode, Boolean> map = new HashMap<>();
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node.next != null) {
            Boolean aBoolean = map.get(node);
            if (aBoolean == null) {
                map.put(node, true);
                node = node.next;
            } else {
                return node;
            }
        }
        return null;
    }
}
