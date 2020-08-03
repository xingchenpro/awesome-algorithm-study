package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/2
 * @desc : 344. 反转字符串
 * https://leetcode-cn.com/problems/reverse-string/
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int i=0, j = s.length-1;
        while (i<j){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        char [] s = {'h','e','l','l','o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
        for (char c : s) {
            System.out.print(c+" ");
        }

    }
}
