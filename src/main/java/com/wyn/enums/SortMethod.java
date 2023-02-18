package com.wyn.enums;

/**
 * 排序种类
 * @author Yining Wang
 * @date 2023年2月18日11:47:38
 * @since <pre>2023/02/18</pre>
 */
public enum SortMethod {

    /**
     * 选择排序
     */
    SELECT("选择排序"),

    /**
     * 插入排序
     */
    INSERT("插入排序"),

    /**
     * 冒泡排序
     */
    BUBBLE("冒泡排序"),

    /**
     * 快速排序
     */
    QUICK("快速排序");

    SortMethod(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
