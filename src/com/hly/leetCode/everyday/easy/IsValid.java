package com.hly.leetCode.everyday.easy;

import java.util.Stack;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/16
 * @QQ :1136513099
 * @desc : 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class IsValid {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            //如果是左括号，把对应的右括号放入栈中
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
                //以上三种都不是，说明为右括号或者别的，出栈，如果栈顶不能和左括号匹配，则不能闭合，返回 false
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        //空，返回true
        return stack.isEmpty();
    }
}
