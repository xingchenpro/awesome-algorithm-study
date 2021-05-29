package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/6/15
 * @QQ :1136513099
 * @desc : 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int n = x;
        int sum = 0;
        while (n != 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        if (x == sum)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(121));
        System.out.println(new IsPalindrome().isPalindrome(-121));
        System.out.println(new IsPalindrome().isPalindrome(10));
    }
}
