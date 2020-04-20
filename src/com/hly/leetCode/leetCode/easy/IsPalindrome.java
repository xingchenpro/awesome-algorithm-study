package com.hly.leetCode.leetCode.easy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/21
 * @QQ :1136513099
 * @desc : 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 */
public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int t = 0;
        //需要赋值，否则，x会改变
        int i = x;
        while (i != 0) {
            t = t * 10 + i % 10;
            i /= 10;
        }
        return x == t;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
