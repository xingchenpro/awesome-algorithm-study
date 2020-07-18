package com.hly.leetCode.everyday.easy;

import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/15
 * @desc :232. 用栈实现队列
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {

    Stack<Integer> in;
    Stack<Integer> out;
    int peek;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }


    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        //为空，记录队列第一个元素,也就是最先入栈的元素
        if (in.isEmpty()){
            peek = x;
        }
        in.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty())
                out.push(in.pop());
        }
        return out.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!out.isEmpty())
            return out.peek();
        return peek;

    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

}
