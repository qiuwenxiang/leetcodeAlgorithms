package com.leetcode.java.stack;

import java.util.Stack;

/**
 * @description: 最小栈
 *
 * 设计一个最小栈，支持push ,pop ,top ,getMin 方法
 *
 * 主要是getMin 在stack中没有， 即要在类中保存一个从小到大排序的存储 ，即minStack
 *
 * stack 为原始数据
 *
 *
 * @author: kylin.qiuwx@foxmail.com
 * @create: 2018-04-09
 **/
public class _155MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        if(minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
