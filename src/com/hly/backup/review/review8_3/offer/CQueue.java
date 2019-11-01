package com.hly.backup.review.review8_3.offer;

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

    public void offer(int n) {
        in.push(n);
    }
    public int poll() {

        //if 判断不能漏，如有out有数字，就直接出栈
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());
        if (out.isEmpty())
            System.out.println("队列为空");
        return out.pop();
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.offer(1);
        cQueue.offer(2);
        cQueue.offer(3);
        System.out.println(cQueue.poll());
    }
}
