package me.chagnwei.leetcode.MinStack155;

import java.util.*;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> stackMin;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.stackMin = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        stackMin.push(Math.min(x, this.getMin()));
    }

    public void pop() {
        stack.poll();
        stackMin.poll();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Integer min = stackMin.peek();
        return min == null ? Integer.MAX_VALUE : min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-1);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
    }
}

