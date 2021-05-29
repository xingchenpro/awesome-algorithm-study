package com.hly.leetCode.offer.offer1;

import java.util.*;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/8
 * @QQ :1136513099
 * @desc : 面试题30. 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class MinStack_30 {
    Stack<Integer> data;
    Stack<Integer> min;

    public MinStack_30() {
        data = new Stack<>();
        min = new Stack<>();

    }

    public void push(int x) {
        data.push(x);
        //这里需要是<=,不然出栈时会少数
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        Integer v = data.pop();
        if (v.equals(min.peek())) {
            min.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack_30 minStack = new MinStack_30();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.min());//-3
        minStack.pop();
        //System.out.println(minStack.top());//0
        System.out.println(minStack.min());//-2
    }
}
