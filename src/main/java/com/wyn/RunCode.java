package com.wyn;

import com.wyn.model.ListNode;
import com.wyn.top100.listnode.ReverseList;
import com.wyn.top100.listnode.SortList;
import com.wyn.utils.build.LinkedListBuilder;

public class RunCode {
    public static void main(String[] args) {
//        int[] nums = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
//        SortStrategy.getMethodMap().get(SortMethod.QUICK).accept(nums);
//        Print.printList(Collections.singletonList(nums));
//        System.out.println();
//        LRUCache lRUCache = new LRUCache(2);
//        lRUCache.put(1,0);
//        lRUCache.put(2, 2);
//        lRUCache.get(1);
//        lRUCache.put(3, 3);
//        lRUCache.get(2);
//        lRUCache.put(4, 4);
//        lRUCache.get(1);
//        lRUCache.get(3);
//        lRUCache.get(4);
        int[] nums = new int[]{1,2,3,4,5};
        ListNode listNode = LinkedListBuilder.buildLinkedList(nums);
        ReverseList reverseList = new ReverseList();
        ListNode listNode1 = reverseList.reverseList(listNode);
        System.out.println();
    }
}
