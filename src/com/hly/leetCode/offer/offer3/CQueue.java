package com.hly.leetCode.offer.offer3;

import java.util.Stack;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/20
 * @QQ :1136513099
 * @desc : 2 遍 AC 面试题09. 用两个栈实现队列
 */
public class CQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public CQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        //出栈为空，才入
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (!out.isEmpty())
            return out.pop();
        return -1;
    }
}
