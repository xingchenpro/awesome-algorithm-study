package com.hly.backup.leetCode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/3/16
 */
//*20.有效的括号
public class IsValid {

    private HashMap<Character, Character> map;

    public IsValid() {
        this.map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.map.containsKey(c)) {//key ),},]
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.map.get(c)) {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        IsValid isValid = new IsValid();

        System.out.println(isValid.isValid("()"));
        System.out.println(isValid.isValid("()[]"));
        System.out.println(isValid.isValid("()[]{}"));
        System.out.println(isValid.isValid("([)]"));
        System.out.println(isValid.isValid("{[]}"));

        //

    }
}
