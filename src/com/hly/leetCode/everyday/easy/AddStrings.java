package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/17
 * @desc : 415. 字符串相加
 * https://leetcode-cn.com/problems/add-strings/
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder res = new StringBuilder();
        //进位判断
        while (i >= 0 || j >= 0 || add != 0) {
            //大于等于 0
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + add;
            res.append(sum % 10);
            add = sum / 10;
            i--;
            j--;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("0", "0"));//0
        System.out.println(new AddStrings().addStrings("1", "9"));//10
    }
}
