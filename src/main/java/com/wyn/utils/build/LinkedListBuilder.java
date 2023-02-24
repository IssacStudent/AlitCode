package com.wyn.utils.build;

import com.wyn.model.ListNode;

/**
 * 构建链表
 * @author Yining Wang
 * @date 2023年2月23日11:04:24
 * @since <pre>2023/02/23</pre>
 */
public class LinkedListBuilder {

    public static ListNode buildLinkedList(int[] list) {
        ListNode head = new ListNode(list[0]);
        ListNode result = head;
        for (int i = 0; i < list.length - 1; i++) {
            head.val = list[i];
            head.next = new ListNode(list[i + 1]);
            head = head.next;
        }
        return result;
    }

}
