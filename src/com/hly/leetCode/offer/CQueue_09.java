package com.hly.leetCode.offer;
import java.util.Stack;
/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/2/28
 * @QQ :1136513099
 * @desc : 面试题09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 注意：提交LeetCode，直接使用静态会出错（用例没有刷新）
 */
public class CQueue_09 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue_09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {

        CQueue_09 cQueue = new CQueue_09();
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(11);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(1);
        cQueue.appendTail(17);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(19);
        cQueue.appendTail(20);
        cQueue.appendTail(13);

    }
}
