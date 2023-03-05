package com.wyn.top100.design;

import java.util.*;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 *
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 *
 * @author Yining Wang
 * @date 2023年3月5日16:15:08
 * @since <pre>2023/03/05</pre>
 */
public class MinStack {

    private Deque<Integer> queue;

    private Deque<Integer> min;

    public MinStack() {
        queue = new LinkedList<>();
        min = new LinkedList<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        queue.addFirst(val);
        min.push(Math.min(min.peek(), val));
    }

    public void pop() {
        queue.pollFirst();
        min.pollFirst();
    }

    public int top() {
        return queue.getFirst();
    }

    public int getMin() {
        return min.getFirst();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
