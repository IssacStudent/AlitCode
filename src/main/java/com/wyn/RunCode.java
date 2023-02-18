package com.wyn;

import com.wyn.enums.SortMethod;
import com.wyn.utils.Print;
import com.wyn.utils.sort.SortStrategy;

import java.util.Collections;

public class RunCode {
    public static void main(String[] args) {
        int[] nums = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        SortStrategy.getMethodMap().get(SortMethod.QUICK).accept(nums);
        Print.printList(Collections.singletonList(nums));
        System.out.println();
    }
}
