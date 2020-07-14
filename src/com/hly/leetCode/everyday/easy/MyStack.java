package com.hly.leetCode.everyday.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/14
 * @desc : 225. 用队列实现栈
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class MyStack {

    Queue<Integer> in;
    Queue<Integer> out;

    public MyStack() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    //用两个队列，入队时，放到入队队列
    //然后把出队队列的元素全部放到入队队列中
    //然后入队队列和出队队列交换
    //每次从出队队列拿元素，这样就模拟了后进先出
    public void push(int x) {
        in.offer(x);
        while (!out.isEmpty()) {
            in.offer(out.poll());
        }
        //in 1,1,2,3
        //out 1,2,3
        Queue<Integer> t = in;
        in = out;
        out = t;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return out.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return out.peek();

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return out.isEmpty();
    }

}
