package com.hly.leetCode.everyday.easy;

/**
 * @author :hly
 *
 * @CSDN :blog.csdn.net/Sirius_hly
 * @WeChat :liangyun2021
 * @date :2020/8/15
 * @desc : 409. 最长回文串
 * https://leetcode-cn.com/problems/longest-palindrome/
 */
public class LongestPalindrome {

    //A-Z 65-90
    //a-z 97-122
    public int longestPalindrome(String s) {
        //65 - 122 ,58 个
        int[] count = new int[58];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        int res = 0;
        for (int i = 0; i < count.length; i++) {
            //如果是奇数，就减一，偶数不变
            res += count[i] - (count[i] & 1);
        }
        //res < s.length() 说明有一组或多组字符为奇数，保留一组即可；否则，每一组相同字符的个数都为偶数，直接返回
        return res < s.length() ? res + 1 : res;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));//7

    }
}
