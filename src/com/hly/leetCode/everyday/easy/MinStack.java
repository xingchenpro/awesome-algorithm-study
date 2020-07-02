package com.hly.leetCode.everyday.easy;

import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/7/2
 * @desc : 155. 最小栈
 * https://leetcode-cn.com/problems/min-stack/
 */
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;

    //注意栈为空的判断
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            min.push(x);
        } else {
            //TODO 这里不能用三木
            stack.push(x);
            int t = min.peek();
            if (x < t) {
                min.push(x);
            } else {
                min.push(t);
            }
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        if (!stack.isEmpty())
            return stack.peek();
        return -1;
    }

    public int getMin() {
        if (!min.isEmpty())
            return min.peek();
        return -1;
    }
}
