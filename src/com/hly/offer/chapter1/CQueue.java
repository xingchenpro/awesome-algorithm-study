package com.hly.offer.chapter1;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/11/7
 * @QQ :1136513099
 * @desc : 9、用两个栈实现队列
 */

import java.util.Stack;

/**
 * 描述：用两个栈实现队列
 */
public class CQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public Integer pop() throws Exception {
        //如果 s2 为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                //把 s1 的数都放到 s2 里面
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new Exception("栈为空");
        }
        //如果不为空，则直接弹出 s2 的数
        return stack2.pop();
    }

    public void offer(Integer num) {
        stack1.push(num);
    }

    public static void main(String[] args) throws Exception {
        CQueue cQueue = new CQueue();
        //System.out.println(cQueue.pop());
        cQueue.offer(1);
        cQueue.offer(2);
        cQueue.offer(3);
        System.out.println(cQueue.pop());
        System.out.println(cQueue.pop());
        cQueue.offer(4);
        System.out.println(cQueue.pop());
        System.out.println(cQueue.pop());
        //System.out.println(cQueue.pop());
    }
}
