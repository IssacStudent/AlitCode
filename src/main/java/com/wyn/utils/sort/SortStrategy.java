package com.wyn.utils.sort;

import com.wyn.enums.SortMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class SortStrategy {

    private static final Map<SortMethod, Consumer<int[]>> METHOD_MAP = new HashMap<>();

    static {
        METHOD_MAP.put(SortMethod.BUBBLE, SortImpl::bubbleSort);
        METHOD_MAP.put(SortMethod.INSERT, SortImpl::insertSort);
        METHOD_MAP.put(SortMethod.QUICK, SortImpl::doQuickSort);
        METHOD_MAP.put(SortMethod.SELECT, SortImpl::selectSort);
    }

    public static Map<SortMethod, Consumer<int[]>> getMethodMap() {
        return METHOD_MAP;
    }
}
