package com.hly.leetCode.offer.offer3;

import java.util.Stack;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/24
 * @QQ :1136513099
 * @desc : 面试题31. 栈的压入、弹出序列
 */
public class ValidateStackSequences {


    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        //循环遍历压栈顺序
        for (int i = 0; i < pushed.length; i++) {
            //放入辅助栈
            stack.push(pushed[i]);
            //如果当前栈顶元素等于弹出序列元素，则执行出栈，弹出序列 j++
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }
        //最后为空，表示为正确的出栈顺序
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] pushed2 = {1, 2, 3, 4, 5};
        int[] popped = {1, 2, 3, 4, 5};
        int[] popped2 = {4, 3, 5, 1, 2};
        System.out.println(validateStackSequences(pushed, popped));
        System.out.println(validateStackSequences(pushed2, popped2));
    }
}
