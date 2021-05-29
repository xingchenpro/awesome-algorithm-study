package com.stardust.offer;

import java.util.Stack;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :xcvip2021
 * @date :2021/5/16
 * @desc : 31. 栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 解释：1 不能在 2 之前弹出。
 */
public class ValidateStackSequences {

    //O(n) O(n)l
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        //定义一个临时栈
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        //循环入栈，放到临时栈里面
        for (int num : pushed) {
            stack.push(num);
            //如果临时栈不为空，或者栈顶元素等于出栈元素，出栈索引向后移动，等待下一步判断
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        //如果为空，表示栈里面还有元素，没有出完，不符合出栈顺序

        return stack.isEmpty();

    }


    public static void main(String[] args) {


    }
}
