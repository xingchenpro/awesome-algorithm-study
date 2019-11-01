package com.hly.backup.offer.chapter2;

import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/30
 * @QQ :1136513099
 * @desc :9、使用两个栈实现队列
 */
public class CQueue {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int ele) {
        in.push(ele);
    }

    public int pop() throws Exception {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());
        if (out.isEmpty())
            throw new Exception("队列为空");
        return out.pop();
    }

    public static void main(String[] args) throws Exception {
        CQueue cQueue = new CQueue();
        cQueue.push(1);
        cQueue.push(2);
        cQueue.push(3);
        System.out.println(cQueue.pop());
    }
}
